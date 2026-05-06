package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.PreSaleDetailEntity
import mx.diossa.multibusiness.data.local.entity.PreSaleEntity

data class ApiResponsePreSale(
    val data: PreSaleEntity,
    val message: String?
)

data class ApiResponsePreSaleDetail(
    val data: PreSaleDetailEntity,
    val message: String?
)
