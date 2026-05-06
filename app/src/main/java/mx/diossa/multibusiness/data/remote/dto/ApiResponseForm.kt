package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.FormVisitEntity

data class ApiResponseForm(
    val data: List<FormVisitEntity>,
    val message: String?
)
