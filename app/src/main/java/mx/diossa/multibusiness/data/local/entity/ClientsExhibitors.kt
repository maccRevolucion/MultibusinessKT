package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("clientsExhibitors")
data class ClientsExhibitors(
    @PrimaryKey
    @SerializedName("clientIdExhibitor")
    val clientIdExhibitor: Int,
    @SerializedName("clientId")
    val clientId: Int?,
    @SerializedName("exhibitorId")
    val exhibitorId: Int?,
    @SerializedName("routeId")
    val routeId: Int?,
    @SerializedName("active")
    val active: Int?
)