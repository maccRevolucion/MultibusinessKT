package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("monederoAsociacionEntity")
data class MonederoAsociacionEntity(
    @PrimaryKey
    @SerializedName("associationId")
    val associationId: String,
    @SerializedName("productId")
    val productId: Int,
    @SerializedName("lineId")
    val lineId: Int,
    @SerializedName("familiId")
    val familiId: Int
)
