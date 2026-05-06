package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.RouteEntity

data class ApiResponseRoute(
    val data: RouteEntity,
    val message: String?
)
