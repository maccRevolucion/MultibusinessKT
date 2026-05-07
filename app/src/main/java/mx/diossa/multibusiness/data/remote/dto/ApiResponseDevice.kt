package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.DeviceEventEntity

data class ApiResponseDevice(
    val data: DeviceEventEntity,
    val message: String?
)
