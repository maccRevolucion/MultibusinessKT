package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("deviceEventEntity")
data class DeviceEventEntity(
    @PrimaryKey
    @SerializedName("deviceEventId")
    val deviceEventId: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("date")
    val date: String,
    @SerializedName("hour")
    val hour: String,
    @SerializedName("latitude")
    val latitud: String,
    @SerializedName("longitude")
    val logitud: String
)
