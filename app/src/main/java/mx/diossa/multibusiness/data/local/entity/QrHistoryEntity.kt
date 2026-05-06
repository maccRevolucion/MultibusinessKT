package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("qrHistoryEntity")
data class QrHistoryEntity(
    @PrimaryKey
    val id: Int,
    val codescan: String?
)
