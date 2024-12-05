package teamhp.alarm_open.domain.dto

data class Performance(
    val eventNm: String,
    val opar: String,
    val eventCo: String,
    val eventStartDate: String,
    val eventEndDate: String,
    val eventStartTime: String,
    val eventEndTime: String,
    val chrgeInfo: String,
    val mnnstNm: String,
    val auspcInsttNm: String,
    val phoneNumber: String,
    val seatNumber: String?,
    val admfee: String?,
    val entncAge: String,
    val atpn: String,
    val homepageUrl: String,
    val prkplceYn: String,
    val rdnmadr: String,
    val lnmadr: String,
    val latitude: String,
    val longitude: String,
    val referenceDate: String,
    val insttCode: String
)
