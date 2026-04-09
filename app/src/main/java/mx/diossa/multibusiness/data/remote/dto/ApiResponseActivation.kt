package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.ActivationProductEntity

data class ApiResponseActivation(
    val data: ActivationProductEntity,
    val message: String
)
