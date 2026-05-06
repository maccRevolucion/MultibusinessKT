package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("initiativeDetailGenerateEntity")
data class InitiativeDetailGenerateEntity(
    @SerializedName("id_iniciativa")
    val iniciativeId: Int,
    @SerializedName("id_producto_venta")
    val producId: Int?
)
