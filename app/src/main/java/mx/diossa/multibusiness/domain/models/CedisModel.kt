package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class CedisModel(
    @SerializedName("nombre_cedis")
    val cedisName: String,
    @SerializedName("id_cedis")
    val cedisId: Int,
    @SerializedName("clave")
    val key: String,
    @SerializedName("id_lista_precio")
    val priceListId: Int,
    @SerializedName("empresa")
    val company: String,
    @SerializedName("latitud")
    val latitude: String,
    @SerializedName("longitud")
    val longitude: String,
    @SerializedName("domicilio")
    val address: String
)