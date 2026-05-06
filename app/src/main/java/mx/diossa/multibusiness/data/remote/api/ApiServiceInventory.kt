package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseInventory
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceInventory {

    //CARTA DE INVENTARIO DE TRANSPORTE
    @GET("api/carry_letter/retrieve/route_inventory/{id_route}")
    suspend fun getInventory(@Path("id_route") idRoute: Int): ApiResponseInventory
}