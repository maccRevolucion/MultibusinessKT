package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.PromotionsEntity
import mx.diossa.multibusiness.data.local.entity.PromotionsFollowingEntity
import mx.diossa.multibusiness.data.remote.api.ApiServicePromotions
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotion
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotionsActive
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePromotionsFollowing
import javax.inject.Inject

class PromotionsRemoteDataSource @Inject constructor(
    private val apiService: ApiServicePromotions
) {
    suspend fun getPromotions(idRoute: Int): ApiResponsePromotion = apiService.getPromotions(idRoute)

    suspend fun getPromotionsActive(idRoute: Int): ApiResponsePromotionsActive = apiService.getPromotionsActive(idRoute)
    suspend fun postPromotionsActive(request: List<PromotionsFollowingEntity>): ApiResponsePromotionsFollowing = apiService.postPromotionsActive(request)
}