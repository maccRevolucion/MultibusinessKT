package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("productsSkuDetailEntity")
data class ProductSkuDetailEntity(
    @PrimaryKey
    @SerializedName("id_product_sku_detail")
    val idProductSkuDetail: Int,
    @SerializedName("id_product_sku")
    val idProductSku: Int,
    @SerializedName("id_product")
    val idProduct: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("concept")
    val concept: String
)