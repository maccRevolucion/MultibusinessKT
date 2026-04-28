package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("foliosEntity")
data class FoliosEntity(
    @PrimaryKey @SerializedName("serieId")
    val serieId: Int,
    @SerializedName("serie")
    val serie: String?,
    @SerializedName("folioInitial")
    val initialFolio: Int?,
    @SerializedName("folioFinal")
    val finalFolio: Int?,
    @SerializedName("folioCurrent")
    val folioCurrent: Int?,
    @SerializedName("status")
    val status: Int?,
    @SerializedName("concept")
    val concept: String?
)
