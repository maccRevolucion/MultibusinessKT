package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class InitiativeModel(
    @SerializedName("id_iniciativa")
    val initiativeId: Int,
    @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("iniciativaDetalle")
    val initiativeDetail: ArrayList<InitiativeDetailApply>,
    @SerializedName("iniciativaDetalleVenta")
    val initiativeDetailSale: ArrayList<InitiativeDetailGenerate>,
    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_termino")
    val endDate: String,
    @SerializedName("importe")
    val amount: Float,
    @SerializedName("nombre_cupon")
    val couponName: String,
    @SerializedName("usuario_registro")
    val userRegister: Int,
    @SerializedName("fecha_registro")
    val registerDate: String,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("venta")
    val amountSelltoCoupon: Float,
    @SerializedName("descuento")
    val discount: Float,
    @SerializedName("tipo_iniciativa_venta")
    val typeInitiativeSale: Int,
    @SerializedName("tipo_iniciativa_descuento")
    val anyProduct: Int,
    @SerializedName("misma_venta")
    val forFirstSale: Int,
    @SerializedName("limite_cupones")
    val maxCouponQuantity: Int,
    @SerializedName("tipo_cupon")
    val couponType: Int,
    @SerializedName("iniciativaForma")
    val kindInit: Boolean,
    @SerializedName("totalProductoRegala")
    val productTotalToGift: Int
)

data class InitiativeDetailApply(
    @SerializedName("id_iniciativa")
    val initiativeId: Int,
    @SerializedName("id_producto")
    val productId: Int
)

data class InitiativeDetailGenerate(
    @SerializedName("id_iniciativa")
    val initiativeId: Int,
    @SerializedName("id_producto_venta")
    val productId: Int
)