package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.MinimalSaleKVualaEntity

data class ApiResponseMinimal(
    val data: MinimalSaleKVualaEntity,
    val message: String?
)
