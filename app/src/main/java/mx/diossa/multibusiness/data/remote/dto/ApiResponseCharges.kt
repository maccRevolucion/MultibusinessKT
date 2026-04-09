package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.ChargesEntity

data class ApiResponseCharges(
    val data: List<ChargesEntity>,
    val message: String
)
