package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import mx.diossa.multibusiness.data.local.entity.FuelTicketEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFuel
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFuelVoucher
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServiceFuel {

    //TICKET-BOLETO DE COMBUSTIBLE
    @GET("api/route/{id_route}/fuels")
    suspend fun getFuel(@Path("id_route") idRoute: Int): ApiResponseFuelVoucher

    @POST("api/fuels")
    suspend fun postFuel(@Body request: List<FuelTicketEntity>): ApiResponseFuel


}