package mx.diossa.multibusiness.data.local.entity

import androidx.room.PrimaryKey
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity("typeClientEntity")
data class TypeClientEntity (
    @PrimaryKey
    @SerializedName("id_cliente_tipo")
    val idTypeClient: Int,
    @SerializedName("nombre")
    val name: String?,
    @SerializedName("activo")
    val active: Boolean?,
    @SerializedName("usuario_registro")
    val userRegister: Int?,
    @SerializedName("fecha_registro")
    val dateRegister: String?
)