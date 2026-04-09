package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.ChargesEntity
    import mx.diossa.multibusiness.data.remote.dto.ApiResponseCharges
    import retrofit2.http.Body
    import retrofit2.http.GET
    import retrofit2.http.POST
    import retrofit2.http.Path

interface ApiServiceCharges {
    @GET("api/route/{id_route}/charges")
    suspend fun getCharges(@Path("id_route") idRoute: Int): ApiResponseCharges

    @POST("api/charges")
    suspend fun postCharges(@Body request: List<ChargesEntity>): ApiResponseCharges
}