package teamhp.alarm_open.domain.service

import org.springframework.stereotype.Service
import teamhp.alarm_open.domain.dto.Performance
import teamhp.alarm_open.domain.dto.RegionList
import teamhp.alarm_open.domain.entity.PerformanceDB
import teamhp.alarm_open.domain.model.QueryDslOpenApi

@Service
class PerformanceService(
    private val queryDslOpenApi: QueryDslOpenApi
) {


    fun getAllPerformanceList(): List<PerformanceDB> {
        return queryDslOpenApi.findCurrentAndUpcomingEvents()
    }

    fun getRegionImageUrl(): List<RegionList>{
        return listOf(
            RegionList(regionCode = 1, regionName = "서울", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_01.svg?alt=media&token=89dc26ac-23ce-4d12-b46c-c571b0d26bcf"),
            RegionList(regionCode = 2, regionName = "부산", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_02.svg?alt=media&token=215678eb-d01e-4061-8a3c-65a170130101"),
            RegionList(regionCode = 3, regionName = "대구", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_03.svg?alt=media&token=25181768-dc5d-4f65-adc4-88b0b59a422e"),
            RegionList(regionCode = 4, regionName = "인천", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_04.svg?alt=media&token=a87c88a0-ab52-44b1-9cf6-2f0bb9666eac"),
            RegionList(regionCode = 5, regionName = "광주", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_05.svg?alt=media&token=cb011c04-a19e-454d-82a2-6ab6cd8a2242"),
            RegionList(regionCode = 6, regionName = "대전", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_06.svg?alt=media&token=a17a360f-8126-4fde-a905-fd56cb48d672"),
            RegionList(regionCode = 7, regionName = "울산", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_07.svg?alt=media&token=b3193437-b03e-42ec-965f-ab76a15f6163"),
            RegionList(regionCode = 8, regionName = "세종", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_08.svg?alt=media&token=51b40d90-b78f-4c4c-ba34-02bda84e743c"),
            RegionList(regionCode = 9, regionName = "경기", imageUrl =  "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_09.svg?alt=media&token=7cfa27a0-d576-4660-9aef-ca71463fcb45"),
            RegionList(regionCode = 10, regionName = "강원", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_10.svg?alt=media&token=2bd2563f-ab8b-4fef-bfe8-405803cdc3dd"),
            RegionList(regionCode = 11, regionName = "충북", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_11.svg?alt=media&token=a7e38dfc-7b21-46da-aec1-89ccc737b13b"),
            RegionList(regionCode = 12, regionName = "경남", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_12.svg?alt=media&token=14e4dc27-e198-4fad-ad9d-ec68d7714b5d"),
            RegionList(regionCode = 13, regionName = "전북", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_13.svg?alt=media&token=3cfdf8ab-3e73-4012-8d33-bae00e49e84f"),
            RegionList(regionCode = 14, regionName = "전남", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_14.svg?alt=media&token=18b62f5f-0af0-404c-a8ea-742f1dc5b770"),
            RegionList(regionCode = 15, regionName = "경북", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_15.svg?alt=media&token=8944da60-997e-4fae-b934-b42e4cf52706"),
            RegionList(regionCode = 16, regionName = "제주", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_16.svg?alt=media&token=a3d55107-fcd1-4fa8-9e95-a9f6d64f859f"),
            RegionList(regionCode = 17, regionName = "충남", imageUrl = "https://firebasestorage.googleapis.com/v0/b/regionperformancemanager.firebasestorage.app/o/region_17.svg?alt=media&token=d86cb8e4-839d-4448-9a50-7dca657218a9")
        )
    }
}