package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("minimalSaleKVualaEntity")
data class MinimalSaleKVualaEntity(
    @PrimaryKey
    @SerializedName("id_venta_minima_kelloggs_vuala")
    val minimalSaleId: Int,
    @SerializedName("compra_minima_superior")
    val maxSale: Double,
    @SerializedName("compra_minima_inferior")
    val minimalSale: Double,
    @SerializedName("limite")
    val limit: Int
)
