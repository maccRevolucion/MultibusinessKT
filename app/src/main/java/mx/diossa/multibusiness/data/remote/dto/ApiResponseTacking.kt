package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.TrackingEntity

data class ApiResponseTacking(
    val data: TrackingEntity,
    val message: String
)
