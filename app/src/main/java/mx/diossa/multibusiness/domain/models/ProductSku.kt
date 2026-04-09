package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class ProductSku(
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

data class ProductSkuDetail(
    @SerializedName("id_product_sku_detail")
    val idProductSkuDetail: Int,
    @SerializedName("id_product")
    val idProduct: Int,
    @SerializedName("sale_quantity")
    val quantityToSale: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("concept")
    val concept: String
)

data class ProductSkuSale(
    @SerializedName("id_product_sku_sale")
    val idProductSkuDetail: Int,
    @SerializedName("id_product_sku")
    val idProductSku: Int,
    @SerializedName("note_folio")
    val noteReceiveNumber: String,
    @SerializedName("id_product")
    val idProduct: Int,
    @SerializedName("quantity")
    val quantity: Int,
    @SerializedName("concept")
    val concept: String
)