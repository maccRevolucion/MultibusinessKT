package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.HourChangeEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseHour
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServiceHour {

    //CAMBIO DE HORA
    @POST("api/hours_changed_history")
    suspend fun postHour(@Body request: List<HourChangeEntity>): ApiResponseHour
}