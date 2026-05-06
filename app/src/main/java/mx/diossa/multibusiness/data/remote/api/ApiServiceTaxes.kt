package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseTaxes
import retrofit2.http.GET

interface ApiServiceTaxes {

    //IMPUESTOS
    @GET("api/taxes")
    suspend fun getTaxes(): ApiResponseTaxes
}