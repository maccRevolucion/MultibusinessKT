package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.FoliosEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFolios
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServiceFolios {
    //
    @GET("api/route/{id_route}/folios")
    suspend fun getFolios(@Path("id_route") idRoute: Int): ApiResponseFolios

    @POST("api/route/{id_route}/folios")
    suspend fun postFolios(@Path("id_route") idRoute: Int, @Body request: List<FoliosEntity>): ApiResponseFolios
}