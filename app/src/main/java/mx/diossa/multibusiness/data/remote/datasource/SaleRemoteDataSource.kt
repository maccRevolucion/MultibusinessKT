package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.SaleEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceSale
import mx.diossa.multibusiness.data.remote.dto.ApiResponseSale
import javax.inject.Inject

class SaleRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceSale
) {
    suspend fun postSale(request: List<SaleEntity>): ApiResponseSale = apiService.postSale(request)
}