package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseBank
import retrofit2.http.GET

interface ApiServiceBank {
    @GET("api/banks")
    suspend fun getBanks(): ApiResponseBank
}