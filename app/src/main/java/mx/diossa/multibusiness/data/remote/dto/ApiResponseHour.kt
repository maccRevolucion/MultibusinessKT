package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.HourChangeEntity

data class ApiResponseHour(
    val data: HourChangeEntity,
    val message: String?
)
