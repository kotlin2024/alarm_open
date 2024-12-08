package teamhp.alarm_open.domain.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import teamhp.alarm_open.domain.service.OpenApiService

@RequestMapping("/open_api")
@RestController
class OpenApiController(
    private val openApiService: OpenApiService,
) {

    @GetMapping("/region_list")
    fun apiGetRegionPerformanceList(): ResponseEntity<String> {
        return ResponseEntity.status(HttpStatus.OK).body(openApiService.getAllRegionPerformanceList())
    }


}