package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.QrHistoryEntity

data class ApiResponseQr(
    val data: QrHistoryEntity,
    val message: String
)
