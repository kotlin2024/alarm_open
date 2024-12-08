package teamhp.alarm_open.domain.model

import org.springframework.data.jpa.repository.JpaRepository
import teamhp.alarm_open.domain.entity.PerformanceDB

interface OpenApiReposiitory: JpaRepository<PerformanceDB, Long>