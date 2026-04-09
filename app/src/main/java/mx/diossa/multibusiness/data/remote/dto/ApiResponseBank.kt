package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.BankEntity

data class ApiResponseBank(
    val data: List<BankEntity>,
    val message: String
)