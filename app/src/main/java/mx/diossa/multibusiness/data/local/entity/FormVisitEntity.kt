package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("formVisitEntity")
data class FormVisitEntity(
    @SerializedName("justificacion")
    val justification: String,
    @SerializedName("fecha_vigencia")
    val validitydate: String,
    @PrimaryKey @SerializedName("id_visita")
    val visitid: Int,
    @SerializedName("id_tipo_visita")
    val typevisitid: Int,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("id_ruta")
    val routeid: Int
)
