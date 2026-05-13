package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.TypeClientEntity

data class ApiResponseTypeClient(
    val data: List<TypeClientEntity>,
    val message: String?
)
