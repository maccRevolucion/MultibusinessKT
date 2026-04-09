package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class VisitModel(
    @SerializedName("id_visita")
    val visitId: Int,
    val sales: ArrayList<SaleModel>,
    @SerializedName("hora_inicio")
    val hourInitial: String,
    @SerializedName("hora_fin")
    val hourFinish: String,
    @SerializedName("fecha")
    val date: String,
    @SerializedName("latitud")
    val latitude: String,
    @SerializedName("longitud")
    val longitude: String,
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("distancia_apertura")
    val distanceOpening: Float,
    @SerializedName("distancia_cierre")
    val distanceClosed: Float,
    @SerializedName("executeSale")
    val executeSale: Int,
    @SerializedName("statusSale")
    val statusSale: Int,
    @SerializedName("justificacion")
    val justify: String,
    @SerializedName("programados")
    val programmed: Int,
    @SerializedName("formato_visita")
    val visitFormat: String
)