package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseTypeClient
import retrofit2.http.GET

interface ApiServiceTypeClient {

    //TIPO DE CLIENTES
    @GET("api/types_clients")
    suspend fun getTypeClient(): ApiResponseTypeClient
}