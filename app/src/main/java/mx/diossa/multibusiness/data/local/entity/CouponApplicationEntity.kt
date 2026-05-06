package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("couponApplication")
data class CouponApplicationEntity(
    @PrimaryKey
    @SerializedName("aplicationId")
    val applicationId: Int,
    @SerializedName("cuponId")
    val couponId: String?,
    @SerializedName("saleId")
    val saleId: String?,
    @SerializedName("totalUsed")
    val totalUsed: Float?,
    val couponApplicationDetail: List<CouponApplicationDetail>
)
