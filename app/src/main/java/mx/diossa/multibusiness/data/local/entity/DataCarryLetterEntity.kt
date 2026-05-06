package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("dataCarryLetterEntity")
data class DataCarryLetterEntity(
    @PrimaryKey
    @SerializedName("folio")
    val invoice: Int,
    @SerializedName("serie")
    val serie: String?,
    @SerializedName("tipo_comprobante")
    val typeVoucher: String?,
    @SerializedName("lugar_emision")
    val broadcastPlace: Int?,
    @SerializedName("fecha_hora_emision")
    val broadcastDateTime: String?,
    @SerializedName("nombre_factura")
    val invoiceName: String?,
    @SerializedName("rfc")
    val rfc: String?,
    @SerializedName("tipo_ubicacion_origen")
    val sourceLocationType: String?,
    @SerializedName("rfc_remitente")
    val rfcRemitter: String?,
    @SerializedName("rfc_destinatario")
    val rfc_recipient: String?,
    @SerializedName("fecha_hora_salida")
    val departureDateTime: String?,
    @SerializedName("fecha_hora_retorno")
    val returnDateTime: String?,
    @SerializedName("distancia_recorrida")
    val distanceTraveled: Int?,
    @SerializedName("peso_bruto_total")
    val grossWeightTotal: Double?,
    @SerializedName("num_mercancias")
    val numMerchandise: Int?,
    @SerializedName("unidad_peso")
    val unitWeight: String?,
    @SerializedName("clave_permiso")
    val permissionKey: String?,
    @SerializedName("numero_permiso")
    val permitNumber: String?,
    @SerializedName("placa_vehiculo")
    val vehiclePlate: String?,
    @SerializedName("anio_modelo")
    val yearModel: Int?,
    @SerializedName("aseguradora")
    val insuranceCarrier: String?,
    @SerializedName("poliza_resp_civil")
    val civilRespPolicy: Int?,
    @SerializedName("tipo_figura")
    val figureType: String?,
    @SerializedName("rfc_figura")
    val rfcFigure: String?,
    @SerializedName("no_licencia")
    val noLicensing: String?,
    @SerializedName("nombre_figura")
    val figureName: String?,
    @SerializedName("estado_figura")
    val figureState: String?,
    @SerializedName("codigo_figura")
    val codeFigure: Int?,
    @SerializedName("nombre_ruta")
    val pathName: String?,
    @SerializedName("folio_fiscal")
    val taxFolio: String?,
    @SerializedName("numero_certificado_sat")
    val satCertificateNumber: String?,
    @SerializedName("fecha_hora_certificado")
    val certificateProvider: String?,
    @SerializedName("rfc_proveedor_certificado")
    val rfcCertificateProvider: String?,
    @SerializedName("sello_digital_sat")
    val stampDigitalSat: String?,
    @SerializedName("sello_digital_cfdi")
    val cfdiDigitalStamp: String?,
    @SerializedName("cadena_original")
    val originalString: String?
)
