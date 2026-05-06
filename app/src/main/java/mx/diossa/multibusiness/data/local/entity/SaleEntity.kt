package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("saleEntity")
data class SaleEntity(
    @PrimaryKey
    @SerializedName("salesId")
    val salesId: String,
    @SerializedName("salesDetails")
    val salesDetailEntities: List<SaleDetailEntity>,

    @SerializedName("salesMethodPayments")
    val salesMethodPaymentsEntity: List<SalesMethodPaymentEntity>,

    @SerializedName("visitId")
    val visitId: String?,
    @SerializedName("preSale")
    val preSale: Int?,
    @SerializedName("folioNota")
    val folioNota: String?,
    @SerializedName("clientId")
    val clientId: Int?,
    @SerializedName("routeId")
    val routeId: Int?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("dateDelivery")
    val dateDelivery: String?,
    @SerializedName("hour")
    val hour: String?,
    @SerializedName("subTotal")
    val subTotal: Double?,
    @SerializedName("totalIva")
    val totalIva: Double?,
    @SerializedName("totalIeps")
    val totalIeps: Double?,
    @SerializedName("total")
    val total: Double?,
    @SerializedName("methodPayment")
    val methodPayment: String?,
    @SerializedName("bank")
    val bank: String?,
    @SerializedName("numberAccount")
    val numberAccount: String?,
    @SerializedName("typeCredit")
    val typeCredit: Int?,
    @SerializedName("closed")
    val closed: Int?,
    @SerializedName("invoice")
    val invoice: Int?,
    @SerializedName("bonification")
    val bonification: Int?,
    @SerializedName("latitud")
    val latitude: String?,
    @SerializedName("longitud")
    val longitude: String?,
    @SerializedName("conceptId")
    val concept: Int?,
    @SerializedName("statusSale")
    val statusSale: Int?,
    @SerializedName("statusSalesRmi")
    val statusSalesRmi: Int?,
    @SerializedName("modificationReason")
    val modificationReason: String?,
    @SerializedName("useCfdiId")
    val useCfdiId: Int?,
    @SerializedName("id_preventa_parent")
    val parentPresaleId: Int?,
    val newClient: Int?,
    val bonificationTotal: Double?,
    val neto: Double?
)
