package teamhp.alarm_open.domain.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.dto.RegionList
import teamhp.alarm_open.domain.entity.PerformanceDB
import teamhp.alarm_open.domain.service.PerformanceService

@RequestMapping("/performance")
@RestController
class PerformanceController(
    private val performanceService: PerformanceService,
) {


    @GetMapping("/all")
    fun getAllPerformanceList(): ResponseEntity<List<PerformanceDB>> {
        return ResponseEntity.status(HttpStatus.OK).body(performanceService.getAllPerformanceList())

    }

    @GetMapping("/region_image")
    fun getRegionImageUrl(): ResponseEntity<List<RegionList>>{
        return ResponseEntity.status(HttpStatus.OK).body(performanceService.getRegionImageUrl())
    }
}