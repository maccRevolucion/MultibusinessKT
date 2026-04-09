package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.ExhibitorsEntity

data class ApiResponseExhibitors(
    val data: List<ExhibitorsEntity>,
    val message: String
)
