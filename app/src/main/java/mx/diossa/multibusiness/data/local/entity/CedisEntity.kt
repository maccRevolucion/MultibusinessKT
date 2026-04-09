package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("cedis")
data class CedisEntity(
    @PrimaryKey @SerializedName("id_cedis")
    val cedisId: Int,
    @SerializedName("nombre_cedis")
    val cedisName: String?,
    @SerializedName("clave")
    val key: String?,
    @SerializedName("id_lista_precio")
    val priceListId: Int?,
    @SerializedName("empresa")
    val company: String?,
    @SerializedName("latitud")
    val latitude: String?,
    @SerializedName("longitud")
    val longitude: String?,
    @SerializedName("domicilio")
    val address: String?
)