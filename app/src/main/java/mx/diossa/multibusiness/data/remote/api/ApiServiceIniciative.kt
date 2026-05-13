package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.InitiativeEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiative
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailApply
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailGenerate
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiServiceIniciative {

    //CUPON DE INICIATIVA
    @GET("api/initiatives_cupon")
    suspend fun getIniciative(): ApiResponseInitiative

    @POST("api/cupon")
    suspend fun postIniciative(@Body request: List<InitiativeEntity>): ApiResponseInitiative

    //DETALLE DE CUPON DE INICIATIVA
    @GET("api/initiatives_cupon_detail")
    suspend fun getIniciativeCuponDetail(): ApiResponseInitiativeDetailGenerate

    //DETALLE INICIATIVA DE CUPON DE VENTA
    @GET("api/initiatives_cupon_sale_detail")
    suspend fun getIniciativeCuponDetailApply(): ApiResponseInitiativeDetailApply
}