package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.LoadsEntity

data class ApiResponseLoads(
    val data: LoadsEntity,
    val message: String
)
