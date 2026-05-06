package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("hourChangeEntity")
data class HourChangeEntity(
    @PrimaryKey
    @SerializedName("idEvento")
    val idEvento: String,
    @SerializedName("description")
    val description: String?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("hour")
    val hour: String?,
    @SerializedName("hourChanged")
    val hourChanged: String?
)
