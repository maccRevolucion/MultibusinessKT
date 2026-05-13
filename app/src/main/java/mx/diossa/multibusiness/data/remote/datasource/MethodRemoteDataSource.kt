package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceMethod
import mx.diossa.multibusiness.data.remote.dto.ApiResponseMethod
import javax.inject.Inject

class MethodRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceMethod
) {
    suspend fun getMethod(): ApiResponseMethod = apiService.getMethod()
}