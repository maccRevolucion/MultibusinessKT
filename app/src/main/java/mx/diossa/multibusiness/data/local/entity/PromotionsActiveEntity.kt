package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("promotionsActiveEntity")
data class PromotionsActiveEntity (
    @PrimaryKey
    @SerializedName("id_promocion_activa")
    val promotionsActive: Int,
    @SerializedName("id_promocion")
    val promotionId: Int,
    @SerializedName("id_cliente")
    val clientId: Int,
    @SerializedName("cantidad")
    val quantity: Int

)