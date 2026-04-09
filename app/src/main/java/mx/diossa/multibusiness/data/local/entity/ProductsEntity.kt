package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("productsEntity")
data class ProductsEntity(
    @SerializedName("id_linea")
    val lineId: Int,
    @PrimaryKey @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("preventa")
    val preSale: Int,
    @SerializedName("id_proveedor")
    val providerId: Int,
    @SerializedName("inventario")
    val inventory: Int,
    @SerializedName("nombre")
    val name: String,
    @SerializedName("orden_proveedor")
    val providerOrder: String,
    @SerializedName("precio_neto")
    val priceNeto: Float,
    @SerializedName("precio_unitario")
    val priceUnitary: Float,
    @SerializedName("proveedor")
    val provider: String,
    @SerializedName("rmi_autorizado")
    val authorizationRmi: Boolean,
    @SerializedName("rmv_autorizado")
    val authorizationRmv: Boolean,
    @SerializedName("tasa_ieps")
    val ieps: Float,
    @SerializedName("tasa_iva")
    val iva: Float,
    @SerializedName("inventario_fisico")
    val physicInventory: Int,
    @SerializedName("order_insert")
    val order: String,
    @SerializedName("arqueador")
    val arching: Int,
    @SerializedName("id_subfamilia")
    val subfamilyId: Int
)
