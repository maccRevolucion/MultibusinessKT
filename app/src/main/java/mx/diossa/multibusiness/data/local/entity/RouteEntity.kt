package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("routeEntity")
data class RouteEntity(
    @PrimaryKey
    @SerializedName("id_ruta")
    val routeId: Int,
    @SerializedName("nombre")
    val name: Int?,
    @SerializedName("alta_clientes")
    val addClients: Int?,
    @SerializedName("fuera_recorrido")
    val outTravel: Int?,
    @SerializedName("arqueo")
    val arching: Int?,
    @SerializedName("hora_entrega")
    val deliveryHour: String?,
    @SerializedName("id_ruta_grupo")
    val idGroupRoute: Int?,
    @SerializedName("ultima_liquidacion")
    val lastLiquidation: String?
)
