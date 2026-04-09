package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.DebtChargeEntity

data class ApiResponseDebt(
    val data: DebtChargeEntity,
    val message: String
)
