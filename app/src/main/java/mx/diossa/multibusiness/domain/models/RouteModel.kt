package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class RouteModel(
    @SerializedName("id_ruta")
    val routeId: Int,
    @SerializedName("nombre")
    val name: Int,
    @SerializedName("alta_clientes")
    val addClients: Int,
    @SerializedName("fuera_recorrido")
    val outTravel: Int,
    @SerializedName("arqueo")
    val arching: Int,
    @SerializedName("hora_entrega")
    val deliveryHour: String,
    @SerializedName("id_ruta_tipo")
    val idRouteType: Int,
    @SerializedName("ultima_liquidacion")
    val lastLiquidation: String
)