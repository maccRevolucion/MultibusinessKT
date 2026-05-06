package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("LogMovementsEntity")
data class LogMovements(
    @PrimaryKey @SerializedName("logId")
    val logId: String,
    @SerializedName("movement")
    val movement: String?,
    @SerializedName("date")
    val date: String?,
    @SerializedName("hour")
    val hour: String?,
    @SerializedName("routeId")
    val routeId: Int?,
    @SerializedName("employeeId")
    val employeeId: Int?,
    @SerializedName("success")
    val success: Boolean?
)
