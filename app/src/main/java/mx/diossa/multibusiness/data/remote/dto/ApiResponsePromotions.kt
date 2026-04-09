package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.PromotionItemEntity
import mx.diossa.multibusiness.data.local.entity.PromotionsActiveEntity
import mx.diossa.multibusiness.data.local.entity.PromotionsEntity
import mx.diossa.multibusiness.data.local.entity.PromotionsFollowingEntity

data class ApiResponsePromotion(
    val data: PromotionsEntity,
    val message: String
)

data class ApiResponsePromotionItem(
    val data: PromotionItemEntity,
    val message: String
)

data class ApiResponsePromotionsActive(
    val data: PromotionsActiveEntity,
    val message: String
)

data class ApiResponsePromotionsFollowing(
    val data: PromotionsFollowingEntity,
    val message: String
)
