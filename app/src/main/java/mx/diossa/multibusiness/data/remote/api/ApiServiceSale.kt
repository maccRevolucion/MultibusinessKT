package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.FuelTicketEntity
import mx.diossa.multibusiness.data.local.entity.SaleEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseSale
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServiceSale {

    //DETALLE DE VENTA
    @POST("api/sale")
    suspend fun postSale(@Body request: List<SaleEntity>): ApiResponseSale
}