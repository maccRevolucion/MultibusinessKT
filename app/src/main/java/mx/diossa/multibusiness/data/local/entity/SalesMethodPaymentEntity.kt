package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("salesMethodPaymentEntity")
data class SalesMethodPaymentEntity(
    @PrimaryKey @SerializedName("salesMethodPaymentId")
    val salesMethodPaymentId: String,
    @SerializedName("typePayment")
    val typePayment: String?,
    @SerializedName("idMethodPayment")
    val idMethodPayment: Int?,
    @SerializedName("amount")
    val amount: Float?,
    @SerializedName("bank")
    val bank: String?,
    @SerializedName("account")
    val account: String?
)
