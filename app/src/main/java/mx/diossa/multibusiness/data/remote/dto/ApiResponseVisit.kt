package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.VisitEntity

data class ApiResponseVisit(
    val data: VisitEntity,
    val message: String
)
