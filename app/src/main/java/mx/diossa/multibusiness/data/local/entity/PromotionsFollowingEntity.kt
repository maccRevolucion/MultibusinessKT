package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("promotionFollowingEntity")
data class PromotionsFollowingEntity(
    @PrimaryKey
    val promotionFollowingId: Int,
    @SerializedName("id_promocion")
    val promotionId: Int?,
    val routeId: Int?,
    @SerializedName("id_cliente")
    val clientId: Int?,
    val dateFollowing: String?,
    @SerializedName("folio_nota")
    val folio: String?,
    @SerializedName("cantidad")
    val quantityProm: Int?
)
