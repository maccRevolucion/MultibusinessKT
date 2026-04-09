package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("taxesEntity")
data class TaxesEntity (
    @SerializedName("nombre")
    val name: String,
    @SerializedName("concepto")
    val concept: String,
    @SerializedName("importe")
    val percent: Float,
    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_fin")
    val endDate: String,
    @SerializedName("activo")
    val active: Int
)