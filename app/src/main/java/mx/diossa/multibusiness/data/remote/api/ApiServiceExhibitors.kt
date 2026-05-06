package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseExhibitors
import retrofit2.http.GET

interface ApiServiceExhibitors {

    //EXHIBIDORES
    @GET("api/exhibitors")
    suspend fun getExhibitors(): ApiResponseExhibitors
}