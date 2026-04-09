package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class BankModel(
    @SerializedName("id_banco")
    val idBank: Int,
    @SerializedName("nombre")
    val name: String,
    @SerializedName("clave_fiscal")
    val fiscalKey: String,
    @SerializedName("activo")
    val active: Int,
    @SerializedName("cuenta_contable")
    val account: String,
    @SerializedName("fecha_registro")
    val registerDate: String,
    @SerializedName("usuario_registro")
    val registerUser: String,
    @SerializedName("pagina_web")
    val webPage: String
)