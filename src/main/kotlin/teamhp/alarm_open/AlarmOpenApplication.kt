package teamhp.alarm_open

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@EntityScan(basePackages = ["teamhp.alarm_open.domain.entity"])
@SpringBootApplication
class AlarmOpenApplication

fun main(args: Array<String>) {
    runApplication<AlarmOpenApplication>(*args)
}
