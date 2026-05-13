package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceMinimal
import mx.diossa.multibusiness.data.remote.dto.ApiResponseMinimal
import javax.inject.Inject

class MinimalRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceMinimal
) {
    suspend fun getMinimal(idRoute: Int): ApiResponseMinimal = apiService.getMinimal(idRoute)
}