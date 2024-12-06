package teamhp.alarm_open.domain.service

import org.springframework.stereotype.Service
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.entity.PerformanceDB
import teamhp.alarm_open.domain.model.QueryDslOpenApi

@Service
class PerformanceService(
    private val queryDslOpenApi: QueryDslOpenApi
) {


    fun getAllPerformanceList(): List<PerformanceDB> {
        return queryDslOpenApi.findCurrentAndUpcomingEvents()
    }
}