package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServicePrice
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePrice
import javax.inject.Inject

class PriceRemoteDataSource @Inject constructor(
    private val apiService: ApiServicePrice
){
    suspend fun getPrice(idRoute: Int, date: String): ApiResponsePrice = apiService.getPrice(idRoute, date)
}