package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseMethod
import retrofit2.http.GET

interface ApiServiceMethod {

    //METODO DE PAGO
    @GET("api/methodspayments")
    suspend fun getMethod(): ApiResponseMethod
}