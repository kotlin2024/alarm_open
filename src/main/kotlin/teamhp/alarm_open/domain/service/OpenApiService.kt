package teamhp.alarm_open.domain.service

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import java.net.URI
import org.springframework.jdbc.core.JdbcTemplate
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.entity.PerformanceDB
import teamhp.alarm_open.domain.model.OpenApiReposiitory

@Service
class OpenApiService(
    private val restTemplate: RestTemplate,
    private val openApiReposiitory: OpenApiReposiitory,
) {

    fun getAllRegionPerformanceList(): String {
        // 직접 URL을 사용해 URI 객체 생성
        val url =
            "http://api.data.go.kr/openapi/tn_pubr_public_pblprfr_event_info_api?serviceKey=hsXmG%2FgEgrVuhQOtQYbh5PeLFEYnq5EH2PsY8%2BTuKGKbpU22A6sBWZ2SY1DQ3lNJrxKwF2GcpX0anmnwmNk6XQ%3D%3D&pageNo=1&numOfRows=100&type=xml"

        // URI 객체 생성
        val uri = URI(url)

        // RestTemplate을 사용해 URI로 GET 요청 보내기
        val response = restTemplate.getForObject(uri, String::class.java)

        // 응답이 null일 경우 처리
        val xmlResponse = response ?: return "Failed to fetch data"

        // XML을 객체로 변환
        val xmlMapper = XmlMapper()
        val rootNode = xmlMapper.readTree(xmlResponse)

        // 응답 구조 출력 (디버깅용)
        println("XML Response: $xmlResponse")

        // 루트 노드에서 "body" -> "items" -> "item"으로 접근
        val items = rootNode["body"]?.get("items")?.get("item")

        // items가 null이면 처리
        if (items == null) {
            return "No items found in the response."
        }

        // PerformanceDB 객체 리스트로 변환
        val performances = mutableListOf<PerformanceDB>()
        items.forEach {
            val performanceDB = PerformanceDB(
                eventName = it["eventNm"]?.asText() ?: "Unknown Event",  // 값이 없을 경우 기본값 처리
                location = it["opar"]?.asText(),
                startDate = it["eventStartDate"]?.asText(),
                endDate = it["eventEndDate"]?.asText(),
                startTime = it["eventStartTime"]?.asText(),
                endTime = it["eventEndTime"]?.asText(),
                chargeInfo = it["chrgeInfo"]?.asText(),
                seatNumber = it["seatNumber"]?.asText(),
                admissionFee = it["admfee"]?.asText(),
                ageLimit = it["entncAge"]?.asText(),
                homePageUrl = it["homepageUrl"]?.asText(),
                address = it["rdnmadr"]?.asText(),
                latitude = parseDoubleSafe(it["latitude"]?.asText()),
                longitude = parseDoubleSafe(it["longitude"]?.asText())
            )
            performances.add(performanceDB)
        }

        // DB에 저장
        openApiReposiitory.saveAll(performances)

        // 반환
        return "Data fetched and saved successfully"
    }

    // Double로 변환 시 안전한 파싱 함수
    private fun parseDoubleSafe(value: String?): Double? {
        return try {
            value?.takeIf { it.isNotEmpty() }?.toDouble()
        } catch (e: NumberFormatException) {
            null  // 값이 비어있거나 잘못된 형식이면 null 반환
        }
    }
}