package teamhp.alarm_open.domain.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import teamhp.alarm_open.domain.dto.regionRequeust
import teamhp.alarm_open.domain.service.AlarmService

@RequestMapping("/alarm_open")
@RestController
class AlarmController(
    private val alarmService: AlarmService,
) {

    @GetMapping("/region_list")
    fun getRegionPerformanceList(): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.OK).body(alarmService.getRegionPerformanceList())
    }

//    @GetMapping("/region_list")
//    fun getRegionList(){
//        //TODO() 제공하는 모든 지역 조회
//    }

}