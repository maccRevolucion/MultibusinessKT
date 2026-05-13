package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceRoute
import mx.diossa.multibusiness.data.remote.dto.ApiResponseRoute
import javax.inject.Inject

class RouteRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceRoute
) {
    suspend fun getRoute(idRoute: Int): ApiResponseRoute = apiService.getRoute(idRoute)
}