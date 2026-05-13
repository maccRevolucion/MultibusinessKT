package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.HourChangeEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceHour
import mx.diossa.multibusiness.data.remote.dto.ApiResponseHour
import javax.inject.Inject

class HourChangeRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceHour
){
    suspend fun postHour(request: List<HourChangeEntity>): ApiResponseHour = apiService.postHour(request)
}