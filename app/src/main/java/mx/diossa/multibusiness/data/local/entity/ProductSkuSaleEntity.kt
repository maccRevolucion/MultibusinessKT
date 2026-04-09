package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("productSkuSaleEntity")
data class ProductSkuSaleEntity(
    @PrimaryKey
    @SerializedName("id_product_sku_sale")
    val idProductSkuSale: String,
    @SerializedName("id_product_sku")
    val idProductSku: Int,
    @SerializedName("note_folio")
    val noteFolio: String,
    @SerializedName("id_prod uct")
    val idProduct: Int,

    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("concept")
    val concept: String
)
