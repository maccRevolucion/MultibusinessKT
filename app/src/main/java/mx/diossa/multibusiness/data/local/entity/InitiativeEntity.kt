package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("initiativeEntity")
data class InitiativeEntity(
    @PrimaryKey
    @SerializedName("id_iniciativa")
    val iniciativeId: Int,
    @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("inicitivaDetalle")
    val inicitivaDetalle: List<InitiativeDetailApplyEntity>,
    @SerializedName("inicitivaDetalleVenta")
    val inicitivaDetalleSale: List<InitiativeDetailGenerateEntity>,

    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_termino")
    val endDate: String,
    @SerializedName("importe")
    val importe: Double,
    @SerializedName("nombre_cupon")
    val couponName: String,
    @SerializedName("usuario_registro")
    val registerUSer: String,
    @SerializedName("fecha_registro")
    val registerDate: String,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("venta")
    val amountSellToCupon: Double,
    @SerializedName("descuento")
    val discount: Double,
    @SerializedName("tipo_iniciativa_venta")
    val typeIniciativeSale: Int,
    @SerializedName("tipo_iniciativa_descuento")
    val anyProduct: Int,
    @SerializedName("misma_venta")
    val forFirsSale: Int,
    @SerializedName("limite_cupones")
    val maxCuponQuantity: Int,
    @SerializedName("tipo_cupon")
    val couponType: Int,
    @SerializedName("iniciativaForma")
    val kindInit: Boolean,
    @SerializedName("totalProductoRegala")
    val productTotalToGift: Int
)
