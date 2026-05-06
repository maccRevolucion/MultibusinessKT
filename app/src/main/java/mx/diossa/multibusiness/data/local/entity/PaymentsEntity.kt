package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("paymentsEntity")
data class PaymentsEntity(
    @PrimaryKey
    val paymentId: String,
    @SerializedName("id_cargo")
    val chargeId: Int?,
    @SerializedName("fecha")
    val date: String?,
    @SerializedName("id_ruta")
    val routeId: Int?,
    @SerializedName("importe")
    val amount: Double?,
    @SerializedName("tipo")
    val type: String?,
    @SerializedName("usuario_registro")
    val userRegister: Int?,
    @SerializedName("activo")
    val active: Int?,
    val hour: String?
)
