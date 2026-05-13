package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.PreSaleEntity
import mx.diossa.multibusiness.data.remote.api.ApiServicePreSale
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePreSale
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePreSaleDetail
import javax.inject.Inject

class PreSaleRemoteDataSource @Inject constructor(
    private val apiService: ApiServicePreSale
) {
    suspend fun getPreSale(idRoute: Int): ApiResponsePreSale = apiService.getPreSale(idRoute)
    suspend fun postPreSale(request: List<PreSaleEntity>): ApiResponsePreSale = apiService.postPreSale(request)

    suspend fun getPreSaleDetail(idRoute: Int): ApiResponsePreSaleDetail = apiService.getPreSalesDetail(idRoute)
}