package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.ProductsEntity
import mx.diossa.multibusiness.data.local.entity.ProductSkuDetailEntity
import mx.diossa.multibusiness.data.local.entity.ProductSkuEntity
import mx.diossa.multibusiness.data.local.entity.ProductSkuSaleEntity
import mx.diossa.multibusiness.data.local.entity.ProductsRmiEntity

data class ApiResponseProducts(
    val data: ProductsEntity,
    val message: String
)

data class ApiResponseProductSkuDetail(
    val data: ProductSkuDetailEntity,
    val message: String
)

data class ApiResponseProductSku(
    val data: ProductSkuEntity,
    val message: String
)

data class ApiResponseProductSkuSale(
    val data: ProductSkuSaleEntity,
    val message: String
)

data class ApiResponseProductsRmi(
    val data: ProductsRmiEntity,
    val message: String
)
