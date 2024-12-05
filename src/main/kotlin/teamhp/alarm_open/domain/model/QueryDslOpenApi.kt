package teamhp.alarm_open.domain.model

import org.springframework.stereotype.Repository
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.entity.QPerformanceDB
import teamhp.alarm_open.infra.querydsl.QueryDslSupport
import java.time.LocalDate


@Repository
class QueryDslOpenApi: QueryDslSupport() {

    private val qPerformance = QPerformanceDB.performanceDB

//    fun findAllMonthPlan(): List<Performance> {
//        val startDate = LocalDate.now().withDayOfMonth(1) // 이번 달 첫째 날
//        val endDate = LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth()) // 이번 달 마지막 날
//
//        return queryFactory.selectFrom(qPerformance)
//            .where(
//                qPerformance.type.eq("MONTH"),
//                qPerformance.createdAt.between(startDate, endDate)
//            )
//            .where((planner.check.isFalse))
//            .fetch()
//    }


}