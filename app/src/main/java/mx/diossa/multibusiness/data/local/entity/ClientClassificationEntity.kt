package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("clientClassification")
data class ClientClassificationEntity(
    @PrimaryKey
    @SerializedName("clasificationId")
    val classificationId: Int,
    @SerializedName("description")
    val description: String?,
    @SerializedName("active")
    val active: Int?
)