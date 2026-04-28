package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.FoliosEntity

data class ApiResponseFolios(
    val data: List<FoliosEntity>,
    val message: String
)