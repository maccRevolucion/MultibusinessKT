package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiative
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailApply
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailGenerate
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceIniciative {

    //Iniciative Cupon
    @GET("api/initiatives_cupon")
    suspend fun getIniciative(): ApiResponseInitiative

    @POST("api/cupon")
    suspend fun postIniciative(): ApiResponseInitiative

    //Iniciative Cupon Detail
    @GET("api/initiatives_cupon_detail")
    suspend fun getIniciativeC(): ApiResponseInitiativeDetailGenerate

    //Iniciative Coupon Detail Sale
    @GET("api/initiatives_cupon_sale_detail")
    suspend fun getIniciativeCD(): ApiResponseInitiativeDetailApply
}