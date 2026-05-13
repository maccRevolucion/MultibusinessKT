package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseDataCarry
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceDataCarry {

    //CARTA DE TRANSPORTE DE DATOS
    @GET("api/carry_letter/retrieve/{id_route}")
    suspend fun getData(@Path("id_route") idRoute: Int): ApiResponseDataCarry

}