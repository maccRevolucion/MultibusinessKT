package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceDataCarry
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDataCarry
import javax.inject.Inject

class DataCarryRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceDataCarry
) {
    suspend fun getDataCarry(idRoute: Int): ApiResponseDataCarry = apiService.getData(idRoute)
}