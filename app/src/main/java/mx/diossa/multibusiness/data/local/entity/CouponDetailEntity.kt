package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("couponDetail")
data class CouponDetailEntity(
    @PrimaryKey
    @SerializedName("coupon_detail_id")
    val couponDetailId: String,
    @SerializedName("product_id")
    val productId: Int,
    @SerializedName("quantity")
    val quantity: Int
)