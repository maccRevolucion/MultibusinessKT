package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseHour
import retrofit2.http.POST

interface ApiServiceHour {
    //
    @POST("api/hours_changed_history")
    suspend fun postHour(): ApiResponseHour
}