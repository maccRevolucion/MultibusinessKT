package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.ProductSkuSaleEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseProductSku
import mx.diossa.multibusiness.data.remote.dto.ApiResponseProductSkuDetail
import mx.diossa.multibusiness.data.remote.dto.ApiResponseProductSkuSale
import mx.diossa.multibusiness.data.remote.dto.ApiResponseProducts
import mx.diossa.multibusiness.data.remote.dto.ApiResponseProductsRmi
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServiceProducts {

    //PRODUCTOS
    @GET("api/route/{id_route}/inventory")
    suspend fun getProducts(@Path("id_route") idRoute: Int): ApiResponseProducts

    //PRODUCTOS DE REFERENCIA SKU
    @GET("api/sku")
    suspend fun getProductSku(): ApiResponseProductSku

    @GET("api/sku/details")
    suspend fun getProductSkuDetail(): ApiResponseProductSkuDetail

    @POST("api/sku/sales")
    suspend fun postProductSkuSale(@Body request: List<ProductSkuSaleEntity>): ApiResponseProductSkuSale

    //PRODUCTOS RMI
    @GET("api/listprice/{idRoute}/rmi")
    suspend fun getProductsRmi(@Path("id_route") idRoute: Int): ApiResponseProductsRmi
}