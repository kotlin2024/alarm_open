package teamhp.alarm_open.domain.dto

import jakarta.persistence.Column
import java.util.*

data class Performance(
    val eventName: String,
    val location: String?,
    val startDate: String?,
    val endDate: String?,
    val startTime: String?,
    val endTime: String?,
    val chargeInfo: String?,
    val seatNumber: String?,
    val admissionFee: String?,
    val ageLimit: String?,
    val homePageUrl: String?,
    val address: String?,
    val latitude: Double?,
    val longitude: Double?,
    val region: Long,
)
