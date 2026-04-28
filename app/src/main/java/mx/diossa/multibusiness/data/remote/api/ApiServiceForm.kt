package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseForm
import retrofit2.http.GET

interface ApiServiceForm {
    //
    @GET("api/forms_visits")
    suspend fun getForm(): ApiResponseForm
}