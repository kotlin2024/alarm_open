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
            RegionList(regionCode = 1, regionName = "서울", imageUrl = "https://i.namu.wiki/i/D5988JKoIMbecg4jdFgkDh6lx2KfAfhJwfVKGX3y-_x2_Tg_JFFMbqON7iydzTwixYC9SUZ-IMCa5ANM6Wu7h4q4CjAg9wMEOBVRMa1zmmk_G6pLfkWX3oAaFmrXKyBcQDwmJ1H9aFA6x-wC7rkXpw.svg"),
            RegionList(regionCode = 2, regionName = "부산", imageUrl = "https://i.namu.wiki/i/ptmY1HTqdSt901G7XWEIQk2JShUGHkVfLxwWE6eNCz6s9m_QMEJCMBJiX7wY3KZLNU82KQzoM3IluqZSBepq0FhemYWRagypHZ8IeadM7X2tS_3NUoRjIZvSPtkWrz34SC6kr7k8ASDbqNt393S9cg.svg"),
            RegionList(regionCode = 3, regionName = "대구", imageUrl = "https://i.namu.wiki/i/-ea5YFMW9F6Q2J7uIMTss0cRs0cpNiOt50MzimV9CLY0vJQaUcc7BupLjDjIgkU-DMrMUMnptWzwJUhqRCeUFH8oFWtgNEaAmmkqzif2rKjCJgpAG8kv56O9jY84drxcPBjw_pjDcNENJBvnS_ge9Q.svg"),
            RegionList(regionCode = 4, regionName = "인천", imageUrl = "https://i.namu.wiki/i/fE-PfEE3XNw-o7-W0r8wUs2nI38RqZwJTk9GF7B6XpA39lLAPu6VwwbL9rrMiyi0jpEavUgnQIC0GH2Zy1z_TwOqXkUX5B3wkjiH67FlNeLpVMxUGz6nonOsjbNNDhXjYTEiWnZwN-M4ZxpycETmFw.svg"),
            RegionList(regionCode = 5, regionName = "광주", imageUrl = "https://i.namu.wiki/i/gAni39K3jr50H1Lt-BCuLBX81MK1XdkmBwaOGebT_tK_JSTN0bejcHJpuWJCpF2qH2tpO212Q5W-XMwVZM8r78Wo-AfhYMrtlauowuweg34oti7bec9s_lrT0hQS6HQGi5iJGvavItwwLPKiGrgIPA.svg"),
            RegionList(regionCode = 6, regionName = "대전", imageUrl = "https://i.namu.wiki/i/N4WCh2vzERRFdKwF3-8zT7qX9BvogCMNyV8gB7_SynWrKacihlPa728hmNfgUYycgeT80GAvS6jqQcV2_d4JUShRH_VgAE6WPxC2gwLf7x02R9JAm9odOa7dyGd61TNjMEdhr12_hPlIJnTT8Kq9RA.svg"),
            RegionList(regionCode = 7, regionName = "울산", imageUrl = "https://i.namu.wiki/i/3dXfhv2YddHfISaeo0t0HWB8_uBGUt9IP8g_JfecyCKEPsxyQPbJ_l4oBVEvfpGV4vL_YaAIwIPDsCXmxhMcT5umoim1t8LbrsChyQx8q_oGsqxzg51pF_6ypqxc6Z852FOvPLVl_KACJ1t1yWlE-A.svg"),
            RegionList(regionCode = 8, regionName = "세종", imageUrl = "https://i.namu.wiki/i/maIkSY9NuXlKaVfWW-uxQrwQdi_UFGX6Sdj6gtI7wDALcDaN_rlqj0ZHwR-tHjkE8DgEnxXPTKX5y0q0mjHS-jfCjJ0NJIXj2f3GNIwkW3QYLdsQUjYUcJNUCMQMkNKHFhrjwtSVFDHonFHQ6IhVnA.svg"),
            RegionList(regionCode = 9, regionName = "경기", imageUrl = "https://i.namu.wiki/i/Rp3l8anQzd0Oj37aQ7MsKPqXS6YzVn2hNwcG-oWRZuzzEJ1TJ9DevnQi2UPJePOhiNj2Cv-3_lM0tb5A6AGVsAvpJGi4lOEuI-wKjjXTslLg3q165rOL9Tb0gc28O3SUw4PQisZ7rjk-NRgClfyssA.svg"),
            RegionList(regionCode = 10, regionName = "강원", imageUrl = "https://i.namu.wiki/i/34fjHERb0dgb_Hf2oqUbaTqxZgluzCaL_grpPBFQOz8nAOunY_GNRAX1BptRwuFOOH-wMJwqgQgyWa3tWRPFuNkiMcsyvhQ06_hwTcoUcyS_bpTYpCLhnMOmZ-9OThx0GQcueO49z5ao9gJT4LOKtg.svg"),
            RegionList(regionCode = 11, regionName = "충북", imageUrl = "https://i.namu.wiki/i/M91flDHFMLpLohx54I_cM0gGpGcjw-InAZk5ri8t9Y7BNFegf6lZ8raBcMk4-MPmcR39lYJzrRTGpHtojnE2FA.svg"),
            RegionList(regionCode = 12, regionName = "경남", imageUrl = "https://i.namu.wiki/i/4gf22RrUr_vmMqkAalzIe5GJO0y8XevvjFh56VH62g7q6EMkxcIfqcipEPVi0R4QORJ1PHtGC58Vhwu55ZJA4W-kIlabHy9mODKibNhYCT553LXfskoK6yfNV8jkvIEm_iYhJB4FZUen2pvEHRck-w.svg"),
            RegionList(regionCode = 13, regionName = "전북", imageUrl = "https://i.namu.wiki/i/Ce3BMWXaQkgthZ9JObPVZHj39O7wyTpyNwwXe4D2OecDp9E3LSVaYw_9fBHnHB9JvIWk204wW8EdE7K3F0l0XqUCX2fQ40YhdT9OQT-xm4Y11SrDI-lK89iw1KqDS0qVA4kJG5vTG4jHjMxvtpNlOg.svg"),
            RegionList(regionCode = 14, regionName = "전남", imageUrl = "https://i.namu.wiki/i/Ni-e2FSxC4aPtAkVdpbbef5shKpGLZrKO_tko-waJyIiUEXjtV-P3Xy5Ym0YPFIJ5uDegACaHEP0Zc2BQMokabSfUMgryjXystWWPsc-7ZBiqTAjrG4Kcl6DNRdEubcmJ_ci53Vrg0ldrfcqbKNjeA.svg"),
            RegionList(regionCode = 15, regionName = "경북", imageUrl = "https://i.namu.wiki/i/bBgUW_gpsQytG5oECD84dWkPhmJvRc9bE_yAY8xaClqd47-2NWVpmw2V6AK7k1xgkxtgUWELwK-LHuBMoqwxUlk2nMi-1S1w6s9FBwi5qF4SQHbVA0LqMs9erbVNIrj1uS-Dq73SizYUzdYLxtfZSQ.svg"),
            RegionList(regionCode = 16, regionName = "제주", imageUrl = "https://i.namu.wiki/i/gBsYO2UoFn0YbRWzeJuqjtsDqSaz1egOTLDEGbSyxyROdq5Bf0pl8h9T_1lNk7LwxqYcyFZnOLHYx0Bs6UhGCOwf8kgfbQaui4yz_uI_upg-Q-QoBLqkmITI6X8T-2qVQo06Qmftw6v5SNn8cDNhVQ.svg"),
            RegionList(regionCode = 17, regionName = "충남", imageUrl = "https://i.namu.wiki/i/VpQvVmMhhwUFUcGOQEzPfAin8uymO3XrlhFsf9USh8odb5OqjFsIjLGOPUlGmJVK4HUOfXJxJGRLNAT0YtWlcSkVMyERuxEGw_H3yY3pVlP4L2fdOUEXZOlVVm6CdTmBi7wIFND3dcCuiJjabcq5zQ.svg"),
        )
    }
}