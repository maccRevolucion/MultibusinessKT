package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.DiscountProductEntity

data class ApiResponseDiscount(
    val data: DiscountProductEntity,
    val message: String
)
