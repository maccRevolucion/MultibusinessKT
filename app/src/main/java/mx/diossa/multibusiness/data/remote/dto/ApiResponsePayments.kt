package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.PaymentsEntity

data class ApiResponsePayments(
    val data: PaymentsEntity,
    val message: String
)
