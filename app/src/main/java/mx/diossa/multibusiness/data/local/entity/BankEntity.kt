package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity(tableName = "bank")
data class BankEntity (
    @PrimaryKey @SerializedName("id_banco") val id: Int,
    @SerializedName("nombre")
    val name:String?,
    @SerializedName("clave_fiscal")
    val fiscalKey: String? = "",
    @SerializedName("activo")
    val active: Int? = 1,
    @SerializedName("cuenta_contable")
    val account: String? = "",
    @SerializedName("fecha_registro")
    val registerDate: String?,
    @SerializedName("usuario_registro")
    val registerUser: Int?,
    @SerializedName("pagina_web")
    val webPage: String?
)