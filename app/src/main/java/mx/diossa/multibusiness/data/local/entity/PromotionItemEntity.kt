package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("promotionItemEntity")
data class PromotionItemEntity(
    @PrimaryKey
    @SerializedName("id_promocion")
    val promotionId: Int,
    @SerializedName("nombre")
    val name: String,
    @SerializedName("cantidad_minima_productos_activa")
    val minActiveProducts: Int,
    @SerializedName("cantidad_maxima_productos_activa")
    val maxActiveProduct: Int,
    @SerializedName("cantidad_minima_productos_descuento")
    val minDiscountProducts: Int,
    @SerializedName("ventas_aptas")
    val eligibleSales: Int,
    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_fin")
    val endDate: String
)
