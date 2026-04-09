package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("clientAuthorization")
data class ClientAuthorizationEntity(
    @PrimaryKey
    @SerializedName("clientId")
    val clientId: Int,
    @SerializedName("creditAuthorized")
    val creditAuthorized: Int?,
    @SerializedName("timeLimit")
    val timeLimit: Int?,
    @SerializedName("creditLimit")
    val creditLimit: Int?,
    @SerializedName("invoice")
    val invoice: Int?,
    @SerializedName("ticketNoVenta")
    val noSaleTicket: Boolean?,
    @SerializedName("bonification")
    val bonification: Int?
)