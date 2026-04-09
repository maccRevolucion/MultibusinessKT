package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("exhibitorsEntity")
data class ExhibitorsEntity(
    @PrimaryKey @SerializedName("exhibidorId")
    val exhibitorId: Int,
    @SerializedName("providerId")
    val providerId: Int?,
    @SerializedName("name")
    val name: String?
)
