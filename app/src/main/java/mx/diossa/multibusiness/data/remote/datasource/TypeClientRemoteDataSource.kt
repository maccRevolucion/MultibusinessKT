package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceTypeClient
import mx.diossa.multibusiness.data.remote.dto.ApiResponseTypeClient
import javax.inject.Inject

class TypeClientRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceTypeClient
) {
    suspend fun getTypeClient(): ApiResponseTypeClient = apiService.getTypeClient()
}