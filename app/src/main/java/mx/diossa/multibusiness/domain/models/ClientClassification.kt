package mx.diossa.multibusiness.domain.models

import com.google.gson.annotations.SerializedName

data class ClientClassification(
    @SerializedName("clasificationId")
    val classificationId: Int,
    @SerializedName("description")
    val description: String,
    @SerializedName("active")
    val active: Int
)