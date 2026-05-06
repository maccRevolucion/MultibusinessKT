package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("trackingEntity")
data class TrackingEntity (
    @PrimaryKey
    @SerializedName("trackingId")
    val trackingId: String,
    @SerializedName("latitude")
    val latitude: String?,
    @SerializedName("longitude")
    val longitude: String?,
    @SerializedName("velocity")
    val velocity: Float?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("hour")
    val hour: String?,
    @SerializedName("distance")
    val distance: Float?
)