package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceCharges
import mx.diossa.multibusiness.data.remote.dto.ApiResponseCharges
import javax.inject.Inject

class ChargesRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceCharges
) {
    suspend fun getCharges(idRoute: Int): ApiResponseCharges = apiService.getCharges(idRoute)
    suspend fun postCharges(request: List<ChargesEntity>): ApiResponseCharges = apiService.postCharges(request)
}