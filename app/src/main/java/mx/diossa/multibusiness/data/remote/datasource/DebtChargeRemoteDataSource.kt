package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.DebtChargeEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceDebts
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDebts
import javax.inject.Inject

class DebtChargeRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceDebts
) {
    suspend fun getDebts(idRoute: Int): ApiResponseDebts = apiService.getDebts(idRoute)
    suspend fun postDebts(request: List<DebtChargeEntity>): ApiResponseDebts = apiService.postDebts(request)
}