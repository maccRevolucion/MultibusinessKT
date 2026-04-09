package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.MethodOfPaymentsEntity

data class ApiResponseMethod(
    val data: MethodOfPaymentsEntity,
    val message: String
)
