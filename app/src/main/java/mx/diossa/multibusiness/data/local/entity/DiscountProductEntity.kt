package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("discountProductEntity")
data class DiscountProductEntity(
    @PrimaryKey @SerializedName("id_promocion_producto_descuento")
    val promotionDiscountId: Int,
    @SerializedName("id_promocion")
    val promotionId: Int,
    @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("cantidad")
    val quantityMinimal: Int,
    @SerializedName("descuento_fraccion_numerador")
    val discountNumerator: Float,
    @SerializedName("descuento_fraccion_demoninador")
    val discountDenominator: Float
)
