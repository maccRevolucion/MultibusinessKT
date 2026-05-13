package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.FuelTicketEntity
import mx.diossa.multibusiness.data.local.entity.PreSaleEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePreSale
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePreSaleDetail
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServicePreSale {

    //PREVENTA
    @GET("api/route/{id_route}/presales")
    suspend fun getPreSale(@Path("id_route") idRoute: Int): ApiResponsePreSale

    @POST("api/presales")
    suspend fun postPreSale(@Body request: List<PreSaleEntity>): ApiResponsePreSale

    //DETALLE DE PREVENTA
    @GET("api/route/{id_route}/details/presales")
    suspend fun getPreSalesDetail(@Path("id_route") idRoute: Int): ApiResponsePreSaleDetail
}