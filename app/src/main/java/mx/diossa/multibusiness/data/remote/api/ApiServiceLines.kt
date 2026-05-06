package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseLines
import retrofit2.http.GET

interface ApiServiceLines {

    //LINEAS
    @GET("api/lines")
    suspend fun getLines(): ApiResponseLines
}