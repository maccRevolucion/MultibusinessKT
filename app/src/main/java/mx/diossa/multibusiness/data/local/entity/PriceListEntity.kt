package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("priceListEntity")
data class PriceListEntity(
    @PrimaryKey
    @SerializedName("id_producto")
    val productId: Int,
    @SerializedName("nombre")
    val name: String,
    @SerializedName("fecha_inicio")
    val startDate: String,
    @SerializedName("fecha_fin")
    val endDate: String,
    @SerializedName("precio_unitario")
    val priceUnitary: Float
)
