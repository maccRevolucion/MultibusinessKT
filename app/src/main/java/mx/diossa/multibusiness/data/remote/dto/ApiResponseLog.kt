package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.LogMovements

data class ApiResponseLog(
    val data: LogMovements,
    val message: String
)
