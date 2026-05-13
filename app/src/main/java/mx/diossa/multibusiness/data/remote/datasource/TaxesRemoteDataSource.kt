package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceTaxes
import mx.diossa.multibusiness.data.remote.dto.ApiResponseTaxes
import javax.inject.Inject

class TaxesRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceTaxes
){
    suspend fun getTaxes(): ApiResponseTaxes = apiService.getTaxes()
}