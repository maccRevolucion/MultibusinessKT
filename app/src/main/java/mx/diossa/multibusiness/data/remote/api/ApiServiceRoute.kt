package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseRoute
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceRoute {
    //
    @GET("api/routes/{id_route}")
    suspend fun getRoute(@Path("id_route") idRoute: Int): ApiResponseRoute
}