package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.CedisEntity

data class ApiResponseCedis(
    val data: CedisEntity,
    val message: String
)
