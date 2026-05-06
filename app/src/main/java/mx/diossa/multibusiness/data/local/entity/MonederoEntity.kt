package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("monederoEntity")
data class MonederoEntity(
    @PrimaryKey
    @SerializedName("walletId")
    val walletId: String,
    @SerializedName("folio")
    val folio: String?,
    val couponEntities: List<CouponEntity>,

    @SerializedName("clientId")
    val clientId: Int?,
    @SerializedName("balance")
    val balance: Double?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("time")
    val time: String?,
    @SerializedName("active")
    val active: Int?
)
