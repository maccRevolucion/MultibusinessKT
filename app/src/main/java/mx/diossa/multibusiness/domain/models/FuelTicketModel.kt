package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class FuelTicketModel(
    @SerializedName("id_combustible_ticket")
    val fuelTicketId: Int,
    @SerializedName("id_combustible_vale")
    val fuelVoucherId: Int,
    @SerializedName("folio")
    val receiveNumber: String,
    @SerializedName("litros")
    val liters: Float,
    @SerializedName("precio")
    val price: Float,
    @SerializedName("subtotal")
    val subtotal: Float,
    @SerializedName("iva")
    val iva: Float,
    @SerializedName("total")
    val total: Float,
    @SerializedName("condiciones_pago")
    val conditionPay: String,
    @SerializedName("kilometros")
    val kilometers: Float,
    @SerializedName("usuario_registro")
    val userRegister: Int
)