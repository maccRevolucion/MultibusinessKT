package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.CatalogueCfdiEntity

data class ApiResponseCatalogue(
    val data: List<CatalogueCfdiEntity>,
    val message: String
)