package mx.diossa.multibusiness.data.local.entity

import androidx.room.PrimaryKey
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("VisitEntity")
data class VisitEntity(
    @PrimaryKey
    @SerializedName("id_visita")
    val visitId: String,


    @SerializedName("hora_inicio")
    val hourInitial: String,
    @SerializedName("hora_fin")
    val hourFinish: String,
    @SerializedName("fecha")
    val date: String,
    @SerializedName("latitud")
    val latitud: String,
    @SerializedName("longitud")
    val longitud: String,
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("distancia_apertura")
    val distanceOpening: Float,
    @SerializedName("distancia_cierre")
    val distanceClosed: Float,
    @SerializedName("executeSale")
    val executeSale: Int,
    @SerializedName("statusSale")
    val statusSale: Int,
    @SerializedName("justificacion")
    val justification: String,
    @SerializedName("programados")
    val programmed: Int,
    @SerializedName("formato_visita")
    val visitFormat: String
)
