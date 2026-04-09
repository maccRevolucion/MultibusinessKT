package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.TypeClientEntity

data class ApiResponseType(
    val data: TypeClientEntity,
    val message: String
)
