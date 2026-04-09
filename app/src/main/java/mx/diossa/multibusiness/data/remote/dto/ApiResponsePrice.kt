package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.PriceListEntity

data class ApiResponsePrice(
    val data: PriceListEntity,
    val message: String
)
