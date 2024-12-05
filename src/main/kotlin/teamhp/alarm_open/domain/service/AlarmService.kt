package teamhp.alarm_open.domain.service

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import org.json.JSONObject
import org.json.JSONArray
import org.springframework.web.util.UriComponentsBuilder
import org.xml.sax.InputSource
import java.net.URI
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Service
class AlarmService(
    private val restTemplate: RestTemplate
) {

    fun getRegionPerformanceList(): String {
        // 직접 URL을 사용해 URI 객체 생성
        val url = "http://api.data.go.kr/openapi/tn_pubr_public_pblprfr_event_info_api?serviceKey=hsXmG%2FgEgrVuhQOtQYbh5PeLFEYnq5EH2PsY8%2BTuKGKbpU22A6sBWZ2SY1DQ3lNJrxKwF2GcpX0anmnwmNk6XQ%3D%3D&pageNo=1&numOfRows=100&type=xml"

        // URI 객체 생성
        val uri = URI(url)

        // RestTemplate을 사용해 URI로 GET 요청 보내기
        val response = restTemplate.getForObject(uri, String::class.java)

        // 응답 반환
        return response ?: "Failed to fetch data"
    }
}