package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.PromotionsFollowingEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotion
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotionsActive
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotionsFollowing
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServicePromotions {

    //PROMOCIONES
    @GET("api/discount_promotion?pk_route={id_route}")
    suspend fun getPromotions(@Path("id_route") idRoute: Int): ApiResponsePromotion

    //PROMOCIONES ACTIVAS
    @GET("api/discount_promotion_following?pk_route={id_route}")
    suspend fun getPromotionsActive(@Path("id_route") idRoute: Int): ApiResponsePromotionsActive

    @POST("api/discount_promotion_following")
    suspend fun postPromotionsActive(@Body request: List<PromotionsFollowingEntity>): ApiResponsePromotionsFollowing
}