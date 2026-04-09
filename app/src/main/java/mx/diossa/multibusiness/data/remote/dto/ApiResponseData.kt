package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.DataCarryLetterEntity

data class ApiResponseData (
    val data: DataCarryLetterEntity,
    val message: String
)