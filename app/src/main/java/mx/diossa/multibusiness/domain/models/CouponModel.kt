package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class CouponModel(
    @SerializedName("cuponId")
    val couponId: Int,
    @SerializedName("folio_cupon")
    val receiveNumber: String,
    @SerializedName("id_iniciativa")
    val initiativeId: Int,
    @SerializedName("details")
    val couponDetails: ArrayList<CouponDetails>,
    @SerializedName("importe")
    val amount: Float,
    @SerializedName("fecha")
    val date: String,
    @SerializedName("time")
    val time: String,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("folio_nota_apply")
    val receiveNumberSale: String,
    @SerializedName("folio_nota_generate")
    val receiveNumberSaleGenerated: String,
    @SerializedName("importe_usado")
    val productAmountApplied: Float,
    val saleIdGenerated: String,
    @SerializedName("id_cliente")
    val clientId: Int,
    val motive: Int,
    val forFirstSale: Int,
    val gift: Int,
    @SerializedName("motivo_cancelacion")
    val motiveCancellation: Int
)

data class CouponDetails(
    val couponDetailId: Int,
    val productId: Int,
    val quantity: Int
)