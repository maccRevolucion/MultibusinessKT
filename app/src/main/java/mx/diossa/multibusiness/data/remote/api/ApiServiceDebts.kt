package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.DebtChargeEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDebt
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceDebts {

    //Debts
    @POST("api/client/debts")
    suspend fun postDebts(@Body request: List<DebtChargeEntity>): ApiResponseDebt

    //Debts Charge
    @GET("api/debts_collections_services")
    suspend fun getDebts(): ApiResponseDebt

}