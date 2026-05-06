package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.LinesEntity

data class ApiResponseLines(
    val data: List<LinesEntity>,
    val message: String?
)
