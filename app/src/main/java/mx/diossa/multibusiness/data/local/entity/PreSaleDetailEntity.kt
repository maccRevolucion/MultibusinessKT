package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("preSaleDetailEntity")
data class PreSaleDetailEntity(
    @SerializedName("id_preventa")
    val preSalesDetailId: String,
    @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("cantidad")
    val quantity: Int,
    @SerializedName("precio_unitario")
    val price: Double,
    @SerializedName("importe")
    val amount: Double,
    @SerializedName("iva")
    val iva: Double,
    @SerializedName("ieps")
    val ieps: Double,
    @SerializedName("total")
    val total: Double,
    @SerializedName("bonificacion_importe")
    val bonificationAmount: Double,
    @SerializedName("bonificacion_porcentaje")
    val bonificationPorcentage: Double,
    @SerializedName("bonificacion_iva")
    val bonificationIva: Double,
    @SerializedName("bonificacion_ieps")
    val bonificationIeps: Double,
    @SerializedName("bonificacion_total")
    val bonificationTotal: Double
)
