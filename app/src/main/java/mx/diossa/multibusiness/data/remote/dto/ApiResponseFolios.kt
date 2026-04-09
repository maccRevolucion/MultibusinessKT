package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.FoliosEntity

data class ApiResponseFolios(
    val data: FoliosEntity,
    val message: String
)