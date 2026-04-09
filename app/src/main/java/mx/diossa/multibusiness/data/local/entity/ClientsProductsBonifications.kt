package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("clientsProductsBonifications")
data class ClientsProductsBonifications(
    @PrimaryKey
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("id_producto")
    val productId: Int?,
    @SerializedName("porcentaje")
    val percentage: Double?,
    @SerializedName("afecta_precio")
    val affectPrice: Boolean?,
    @SerializedName("activo")
    val active: Int?
)