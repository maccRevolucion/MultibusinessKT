package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseMethod
import retrofit2.http.GET

interface ApiServiceMethod {
    //
    @GET("api/methodspayments")
    suspend fun getMethod(): ApiResponseMethod
}