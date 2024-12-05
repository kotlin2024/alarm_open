package teamhp.alarm_open.domain.dto

data class regionPerformanceResponse(
    val region:String,
    val content:String,
    val place: String,
    val startDate:String,
    val endDate:String,
    val homageUrl: String,
)
