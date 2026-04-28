package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseSale
import retrofit2.http.POST

interface ApiServiceSale {
    //
    @POST("api/sale")
    suspend fun postSale(): ApiResponseSale
}