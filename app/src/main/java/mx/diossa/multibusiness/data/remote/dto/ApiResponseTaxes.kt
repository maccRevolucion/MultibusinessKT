package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.TaxesEntity

data class ApiResponseTaxes(
    val data: List<TaxesEntity>,
    val message: String?
)
