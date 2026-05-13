package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseEmployees
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiServiceEmployees {
    //EMPLEADOS
    @GET("api/cedis/{id_cedis}/employees")
    suspend fun getEmployees(@Path("id_cedis") idCedis: Int): ApiResponseEmployees
}