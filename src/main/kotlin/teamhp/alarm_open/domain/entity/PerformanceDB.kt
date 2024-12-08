package teamhp.alarm_open.domain.entity

import jakarta.persistence.*
import teamhp.alarm_open.domain.dto.Performance
import java.util.Date

@Entity
@Table(name = "performance_list")
class PerformanceDB(
    @Column(name = "event_name", nullable = false)
    val eventName: String,

    @Column(name = "location")  // 장소
    val location: String?,

    @Column(name = "start_date")  // 시작 날짜
    val startDate: String?,

    @Column(name = "end_date")  // 종료 날짜
    val endDate: String?,

    @Column(name = "start_time")  // 시작 시간
    val startTime: String?,

    @Column(name = "end_time")  // 종료 시간
    val endTime: String?,

    @Column(name = "charge_info")  // 요금 정보
    val chargeInfo: String?,

    @Column(name = "seat_number")  // 좌석 번호
    val seatNumber: String?,

    @Column(name = "admission_fee")  // 입장 요금
    val admissionFee: String?,

    @Column(name = "age_limit")  // 관람 연령
    val ageLimit: String?,

    @Column(name = "home_page_url")  // 홈페이지 URL
    val homePageUrl: String?,

    @Column(name = "address")  // 주소
    val address: String?,

    @Column(name = "latitude")  // 위도
    val latitude: Double?,

    @Column(name = "longitude")  // 경도
    val longitude: Double?,

    @Column(name= "region")
    val region: Long,

){
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

}

fun PerformanceDB.toResponse(): Performance {
    return Performance(
        eventName = eventName,
        location = location,
        startDate = startDate,
        endDate = endDate,
        startTime = startTime,
        endTime = endTime,
        chargeInfo = chargeInfo,
        seatNumber = seatNumber,
        admissionFee = admissionFee,
        ageLimit = ageLimit,
        homePageUrl = homePageUrl,
        address = address,
        latitude = latitude,
        longitude = longitude,
        region =region,
    )
}
