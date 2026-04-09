package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class ClientReschedule(
    @SerializedName("id_reprogramado")
    val clientIdReschedule: String,
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("id_empleado")
    val employeeId: Int,
    @SerializedName("id_ruta")
    val routeId: Int,
    @SerializedName("dia_reprogramado")
    val dayReprogrammed: Int,
    @SerializedName("orden")
    val order: Int,
    @SerializedName("fecha_visita")
    val dateVisit: String,
    @SerializedName("fecha_registro")
    val dateRegister: String,
    val generated: Boolean
)