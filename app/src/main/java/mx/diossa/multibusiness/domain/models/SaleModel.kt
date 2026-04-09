package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class SaleModel(
    @SerializedName("salesId")
    val salesId: Int,
    @SerializedName("salesDetails")
    val saleDetail: ArrayList<SaleDetail>,
    @SerializedName("salesMethodPayments")
    val salesMethodPayments: SalesMethodPayments,
    @SerializedName("visitId")
    val visitId: String,
    @SerializedName("preSale")
    val preSale: Int,
    @SerializedName("folioNota")
    val receiveNumberNote: String,
    @SerializedName("clientId")
    val clientId: Int,
    @SerializedName("routeId")
    val routeId: Int,
    @SerializedName("date")
    val date: String,
    @SerializedName("dateDelivery")
    val dateDelivery: String,
    @SerializedName("hour")
    val hour: String,
    @SerializedName("subTotal")
    val subtotal: Float,
    @SerializedName("totalIva")
    val totalIva: Float,
    @SerializedName("totalIeps")
    val totalIeps: Float,
    @SerializedName("total")
    val total: Float,
    @SerializedName("methodPayment")
    val methodPayment: String,
    @SerializedName("bank")
    val bank: String,
    @SerializedName("numberAccount")
    val numberAccount: String,
    @SerializedName("typeCredit")
    val typeCredit: Int,
    @SerializedName("closed")
    val closed: Int,
    @SerializedName("invoice")
    val invoice: Int,
    @SerializedName("bonification")
    val bonification: Int,
    @SerializedName("latitud")
    val latitude: String,
    @SerializedName("longitud")
    val longitude: String,
    @SerializedName("conceptId")
    val conceptId: Int,
    @SerializedName("statusSale")
    val statusSale: Int,
    @SerializedName("statusSalesRmi")
    val statusSaleRMI: Int,
    @SerializedName("modificationReason")
    val modificationReason: String,
    @SerializedName("useCfdiId")
    val useCfdiId: Int,
    @SerializedName("id_preventa_parent")
    val parentPreSaleId: Int,
    val newClient: Int,
    val bonificationTotal: Float,
    val neto: Float
)

data class SaleDetail(
    @SerializedName("salesDetailId")
    val salesDetailId: Int,
    @SerializedName("productId")
    val productId: Int,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("price")
    val price: Float,
    @SerializedName("amount")
    val amount: Float,
    @SerializedName("iva")
    val iva: Float,
    @SerializedName("ieps")
    val ieps: Float,
    @SerializedName("total")
    val total: Float,
    @SerializedName("bonificationPorcentage")
    val bonificationPercentage: Float,
    @SerializedName("bonificationTotal")
    val bonificationTotal: Float,
    @SerializedName("bonificationIva")
    val bonificationIva: Float,
    @SerializedName("bonificationAmount")
    val bonificationAmount: Float,
    @SerializedName("bonificationIeps")
    val bonificationIeps: Float
)

data class SalesMethodPayments(
    @SerializedName("salesMethodPaymentId")
    val salesMethodPaymentId: String,
    @SerializedName("typePayment")
    val typePayment: String,
    @SerializedName("idMethodPayment")
    val idMethodPayment: Int,
    @SerializedName("amount")
    val amount: Float,
    @SerializedName("bank")
    val bank: String,
    @SerializedName("account")
    val account: String
)