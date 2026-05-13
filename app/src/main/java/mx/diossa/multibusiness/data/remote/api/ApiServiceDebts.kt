package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.DebtChargeEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDebts
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceDebts {

    //DEUDAS
    @POST("api/client/debts")
    suspend fun postDebts(@Body request: List<DebtChargeEntity>): ApiResponseDebts

    //CARGO DE DEUDAS
    @GET("api/debts_collections_services")
    suspend fun getDebts(idRoute: Int): ApiResponseDebts

}