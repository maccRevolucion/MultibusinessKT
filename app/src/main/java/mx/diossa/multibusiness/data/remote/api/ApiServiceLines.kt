package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseLines
import retrofit2.http.GET

interface ApiServiceLines {
    //
    @GET("api/lines")
    suspend fun getLines(): ApiResponseLines
}