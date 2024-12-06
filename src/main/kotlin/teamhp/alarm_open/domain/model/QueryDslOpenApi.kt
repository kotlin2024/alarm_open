package teamhp.alarm_open.domain.model

import com.querydsl.core.types.dsl.Expressions
import org.springframework.stereotype.Repository
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.entity.PerformanceDB
import teamhp.alarm_open.domain.entity.QPerformanceDB
import teamhp.alarm_open.infra.querydsl.QueryDslSupport
import java.time.LocalDate


@Repository
class QueryDslOpenApi: QueryDslSupport() {

    private val qPerformance = QPerformanceDB.performanceDB

    val today = LocalDate.now()

    fun findCurrentAndUpcomingEvents(): List<PerformanceDB> {
        return queryFactory.selectFrom(qPerformance)
            .where(
                // 시작일이 오늘보다 작거나 같고, 종료일이 오늘 이후인 경우 (진행 중)
                Expressions.dateTemplate(
                    LocalDate::class.java,
                    "TO_DATE({0}, 'YYYY-MM-DD')", qPerformance.startDate
                ).loe(today)
                    .and(
                        Expressions.dateTemplate(
                            LocalDate::class.java,
                            "TO_DATE({0}, 'YYYY-MM-DD')", qPerformance.endDate
                        ).goe(today)
                    )
                    .or( // 또는
                        // 시작일이 오늘 이후인 경우 (예정)
                        Expressions.dateTemplate(
                            LocalDate::class.java,
                            "TO_DATE({0}, 'YYYY-MM-DD')", qPerformance.startDate
                        ).gt(today)
                    )
            )
            .fetch()
    }

}