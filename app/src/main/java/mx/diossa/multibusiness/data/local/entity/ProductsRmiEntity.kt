package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("productsRmiEntity")
data class ProductsRmiEntity(
    @SerializedName("id_linea")
    val lineId: Int?,
    @PrimaryKey @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("nombre")
    val name: String?,
    @SerializedName("order_proveedor")
    val providerOrder: String?,
    @SerializedName("precio_unitario")
    val price: String?,
    @SerializedName("proveedor")
    val provider: String?,
    @SerializedName("rmi_autorizado")
    val authorizationRmi: Boolean?,
    @SerializedName("tasa_ieps")
    val ieps: Float?,
    @SerializedName("tasa_iva")
    val iva: Float?
)
