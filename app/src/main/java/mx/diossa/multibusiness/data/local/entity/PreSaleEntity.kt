package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("preSaleEntity")
data class PreSaleEntity(
    @PrimaryKey
    @SerializedName("id_preventa")
    val preSaleId: String,
    @SerializedName("preSalesDetail")
    val preSaleDetailEntity: List<PreSaleDetailEntity>,

    @SerializedName("id_visita")
    val visitId: String?,
    @SerializedName("id_ruta")
    val routeId: Int?,
    @SerializedName("id_cliente")
    val clientId: Int?,
    @SerializedName("folioNota")
    val folioNota: String?,
    @SerializedName("fecha_preventa")
    val preSaleDate: String?,
    @SerializedName("fecha_entrega")
    val dateDelivery: String?,
    @SerializedName("hora_preventa")
    val hour: String?,
    @SerializedName("fecha_registro")
    val registrationDate: String?,
    @SerializedName("usuario_registro")
    val registrationUser: String?,
    @SerializedName("usuario_modifico")
    val modifiedUser: String?,
    @SerializedName("fecha_modifico")
    val modifiedDate: String?,
    @SerializedName("activo")
    val active: Int?,
    @SerializedName("latitud")
    val latitude: String?,
    @SerializedName("longitud")
    val longitude: String?,
    @SerializedName("origen")
    val origin: Int?,
    @SerializedName("motivo_modificacion")
    val modificationReason: String?,
    @SerializedName("total")
    val total: Float?
)
