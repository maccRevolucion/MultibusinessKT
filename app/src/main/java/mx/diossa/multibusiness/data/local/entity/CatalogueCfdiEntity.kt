package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("catalogueCfdi")
data class CatalogueCfdiEntity(
    @SerializedName("activo")
    val active: Int?,
    @SerializedName("clave")
    val key: String?,
    @SerializedName("descripcion")
    val description: String?,
    @SerializedName("fecha_fin")
    val endDate: String? = "",
    @SerializedName("fecha_inicio")
    val startDate: String?,
    val physical: String?,
    @SerializedName("id_uso_cfdi")
    val useIdCedis: Int?,
    val moral: String?
)