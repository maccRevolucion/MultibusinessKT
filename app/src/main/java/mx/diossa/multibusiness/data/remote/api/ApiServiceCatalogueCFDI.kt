package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseCatalogue
import retrofit2.http.GET

interface ApiServiceCatalogueCFDI {
    @GET("api/uses_cfdi")
    suspend fun getCatalogueCfdi(): ApiResponseCatalogue
}