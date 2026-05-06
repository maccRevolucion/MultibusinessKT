package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponsePayments
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServicePayments {

    //PAGOS
    @GET("api/route/{id_route}/payments")
    suspend fun getPayment(@Path("id_route") idRoute: Int): ApiResponsePayments
}