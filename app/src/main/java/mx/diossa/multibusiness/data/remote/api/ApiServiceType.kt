package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseType
import retrofit2.http.GET

interface ApiServiceType {
    //
    @GET("api/types_clients")
    suspend fun getType(): ApiResponseType
}