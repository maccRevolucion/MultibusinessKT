package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseData
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceData {
    //
    @GET("api/carry_letter/retrieve/{id_route}")
    suspend fun getData(@Path("id_route") idRoute: Int): ApiResponseData

}