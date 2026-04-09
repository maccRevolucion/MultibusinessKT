package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("productSkuEntity")
data class ProductSkuEntity(
    @PrimaryKey
    @SerializedName("id_product_sku")
    val idProductSku: Int,
    @SerializedName("id_product")
    val idProduct: Int,
    @SerializedName("sale_quantity")
    val quantityToSale: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("gift_quantity")
    val quantityToGift: Int
)
