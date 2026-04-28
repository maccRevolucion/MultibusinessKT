package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseMinimal
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceMinimal {
    //
    @GET("api/minimal_kelloggs_vuala_sale?pk_route={id_route}")
    suspend fun getMinimal(@Path("id_route") idRoute: Int): ApiResponseMinimal
}