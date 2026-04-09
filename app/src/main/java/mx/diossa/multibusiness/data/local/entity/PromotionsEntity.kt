package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("promotionsEntity")
data class PromotionsEntity(
    @PrimaryKey
    val id: Int,

    @SerializedName("promotion")
    val promotions: List<PromotionItemEntity>,

    @SerializedName("activation_products")
    val activationProducts: List<ActivationProductEntity>,

    @SerializedName("discount_only_products")
    val discountProducts: List<DiscountProductEntity>,
    val promotionsFollowings: List<PromotionsFollowingEntity>,
)
