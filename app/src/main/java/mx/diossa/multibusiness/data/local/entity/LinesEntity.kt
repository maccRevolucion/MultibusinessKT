package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("linesEntity")
data class LinesEntity(
    @SerializedName("activo")
    val active: Boolean?,
    @SerializedName("cuenta_0")
    val account0: String?,
    @SerializedName("cuenta_16")
    val account16: String?,
    @PrimaryKey @SerializedName("id_linea")
    val lineId: Int,
    @SerializedName("id_proveedor_grupo")
    val groupProviderId: Int?,
    @SerializedName("nombre")
    val name: String?,
    @SerializedName("orden")
    val order: String?,
    @SerializedName("fecha_registro")
    val registrationDate: String?,
    @SerializedName("usuario_registro")
    val registrationUser: Int?
)
