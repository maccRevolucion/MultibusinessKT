package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("couponApplicationDetail")
data class CouponApplicationDetail(

    @SerializedName("productId")
    val productId: Int,
    @SerializedName("amount")
    val amount: Float?
)