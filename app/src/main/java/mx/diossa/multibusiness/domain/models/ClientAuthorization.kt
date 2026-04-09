package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class ClientAuthorization(
    @SerializedName("clientId")
    val clientId: Int,
    @SerializedName("creditAuthorized")
    val creditAuthorized: Int,
    @SerializedName("timeLimit")
    val timeLimit: Int,
    @SerializedName("creditLimit")
    val creditLimit: Int,
    @SerializedName("invoice")
    val invoice: Int,
    @SerializedName("ticketNoVenta")
    val noSaleTicket: Boolean,
    @SerializedName("bonificacion")
    val bonification: Int
)