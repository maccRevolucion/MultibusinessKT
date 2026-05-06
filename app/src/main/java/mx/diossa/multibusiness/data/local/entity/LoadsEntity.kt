package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("LoadsEntity")
data class LoadsEntity(
    @PrimaryKey
    @SerializedName("id_carga")
    val loadId: String,
    @SerializedName("id_ruta")
    val routeId: Int?,
    @SerializedName("movimiento")
    val movement: String?,
    @SerializedName("fecha")
    val date: String?,
    @SerializedName("fecha_registro")
    val registerDate: String?,
    @SerializedName("usuario_registro")
    val registrationUser: String?,
    @SerializedName("idEmpleadoAutorizoEntrada")
    val employeeAuthorizeEntryId: Int?,
    @SerializedName("idEmpleadoAutorizoGuardar")
    val employeeAuthorizeSaveId: Int?,
    @SerializedName("cambio_fecha")
    val changeDate: String?,
    @SerializedName("hora_registro")
    val hour: String?
)
