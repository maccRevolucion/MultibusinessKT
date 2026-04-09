package mx.diossa.multibusiness.data.local.entity

import android.renderscript.Double3
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("saleDetailEntity")
data class SaleDetailEntity(
    @PrimaryKey
    @SerializedName("salesDetailId")
    val salesDetailId: String,
    @SerializedName("productId")
    val productId: Int,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("price")
    val price: Double,
    @SerializedName("amount")
    val amount: Double,
    @SerializedName("iva")
    val iva: Double,
    @SerializedName("total")
    val total: Double,
    @SerializedName("bonificationPorcentage")
    val bonificationPorcentage: Double,
    @SerializedName("bonificationTotal")
    val bonificationTotal: Double,
    @SerializedName("bonificationIva")
    val bonificationIva: Double,
    @SerializedName("bonificationAmount")
    val bonificationAmount: Double,
    @SerializedName("ieps")
    val ieps: Double,
    @SerializedName("bonificationIeps")
    val bonificationIeps: Double
)
