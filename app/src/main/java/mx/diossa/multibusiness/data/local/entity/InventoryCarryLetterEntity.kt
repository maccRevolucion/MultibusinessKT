package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("inventoryCarryLetterEntity")
data class InventoryCarryLetterEntity(
    @PrimaryKey
    @SerializedName("id_producto")
    val idProduct: Int,
    @SerializedName("ClaveProdServ")
    val keyProdServ: Int?,
    @SerializedName("Descripcion")
    val description: String?,
    @SerializedName("Cantidad")
    val quantity: Int?,
    @SerializedName("ClaveUnidad")
    val keyUnit: String?,
    @SerializedName("PesoEnKg")
    val weightKg: Double?,
    @SerializedName("ValorUnitario")
    val unitValue: Double?,
    @SerializedName("Importe")
    val amount: Float?,
    @SerializedName("MaterialPeligroso")
    val dangerousMaterial: String?
)
