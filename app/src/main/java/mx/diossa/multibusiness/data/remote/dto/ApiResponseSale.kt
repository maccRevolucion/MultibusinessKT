package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.SaleEntity
import mx.diossa.multibusiness.data.local.entity.SaleDetailEntity
import mx.diossa.multibusiness.data.local.entity.SalesMethodPaymentEntity

data class ApiResponseSale(
    val data: SaleEntity,
    val message: String?
)

data class ApiResponseSaleDetail(
    val data: SaleDetailEntity,
    val message: String?
)

data class ApiResponseSaleMethodPayment(
    val data: SalesMethodPaymentEntity,
    val message: String?
)

