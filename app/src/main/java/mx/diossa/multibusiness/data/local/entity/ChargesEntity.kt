package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("charges")
data class ChargesEntity(
    @PrimaryKey(autoGenerate = true)
    @SerializedName("id_cargo")
    val chargeId: Int,
    @SerializedName("id_ruta")
    val routeId: Int,
    @SerializedName("id_empleado")
    val employeeId: Int,
    @SerializedName("tipo_credito")
    val creditType: Int,
    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_fin")
    val endDate: String,
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("concepto")
    val concept: Int,
    @SerializedName("folio_recibo")
    val receiveNumberReceived: Int,
    @SerializedName("folio_factura")
    val receiveNumberFacture: String,
    @SerializedName("importe")
    val amount: Float,
    @SerializedName("importe_letra")
    val letterAmount: String,
    @SerializedName("saldo")
    val balance: Float,
    @SerializedName("fecha_registro")
    val registrationDate: String,
    @SerializedName("usuario_registro")
    val registrationUser: Int,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("folio_nota")
    val receiveNumberNote: String,
    @SerializedName("origen")
    val origin: Int,
    @SerializedName("vencida")
    val expired: Int? = 0,
    @SerializedName("id_motivo_cancelacion")
    val cancellationReasonId: Int? = 0,
    val newCharge: Int? = 0,
    val isSynced: Boolean = true
)