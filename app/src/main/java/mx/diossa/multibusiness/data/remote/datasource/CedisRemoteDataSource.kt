package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceCedis
import mx.diossa.multibusiness.data.remote.dto.ApiResponseCedis
import javax.inject.Inject

class CedisRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceCedis
) {
    suspend fun getCedisInfo(idCedis: Int, appVersion: String): ApiResponseCedis = apiService.getCedis(idCedis, appVersion)
}