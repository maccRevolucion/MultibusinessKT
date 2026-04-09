package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("activationProductEntity")
data class ActivationProductEntity(
    @SerializedName("id_promocion_producto_activa")
    @PrimaryKey
    val promotionActiveId: Int,
    @SerializedName("id_promocion")
    val promotionId: Int?,
    @SerializedName("id_producto")
    val productId: Int?,
    @SerializedName("cantidad")
    val quantity: Int?,
    @SerializedName("descuento_fraccion_numerador")
    val discountNumerator: Float?,
    @SerializedName("descuento_fraccion_denominador")
    val descountDenominator: Float?

)
