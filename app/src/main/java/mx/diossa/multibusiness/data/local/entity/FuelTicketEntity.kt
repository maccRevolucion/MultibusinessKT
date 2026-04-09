package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("fuelTicketEntity")
data class FuelTicketEntity(
    @PrimaryKey
    @SerializedName("id_combustible_ticket")
    val fuelTicketId: String,
    @SerializedName("id_combustible_vale")
    val fuelVoucherId: Int,
    @SerializedName("folio")
    val folio: String,
    @SerializedName("litros")
    val litros: Float,
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
    @SerializedName("kilometraje")
    val kilometraje: Float,
    @SerializedName("usuario_registro")
    val userRegister: Int
)
