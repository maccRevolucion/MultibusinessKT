package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseCedis
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceCedis {
    @GET("api/cedis/{id_cedis}/version/{app_ver}")
    suspend fun getCedis(@Path("id_cedis") idCedis: Int, @Path("app_ver") appVersion: String): ApiResponseCedis
}