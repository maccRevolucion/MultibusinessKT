package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponsePrice
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServicePrice {

    //LISTA DE PRECIOS
    @GET("api/route/{id_route}/date/{yyyy-MM-dd}/prices")
    suspend fun getPrice(@Path("id_route") idRoute: Int, @Path("yyyy-MM-dd") date: String): ApiResponsePrice
}