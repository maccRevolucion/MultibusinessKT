package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseForm
import retrofit2.http.GET

interface ApiServiceForm {

    //FORMULARIO DE VISITA
    @GET("api/forms_visits")
    suspend fun getForm(): ApiResponseForm
}