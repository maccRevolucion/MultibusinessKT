package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("client")
data class ClientEntity(
    @PrimaryKey
    @SerializedName("clientId")
    val clientId: Int,
    @SerializedName("sioId")
    val sioId: Int?,
    @SerializedName("rfc")
    val rfc: String?,
    @SerializedName("establishment")
    val establishment: String?,
    @SerializedName("lastName")
    val lastName: String?,
    @SerializedName("lastNameM")
    val lastNameM: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("fisica")
    val physical: Int?,
    @SerializedName("street")
    val street: String?,
    @SerializedName("number")
    val number: String?,
    @SerializedName("colony")
    val colony: String?,
    @SerializedName("locality")
    val locality: String?,
    @SerializedName("city")
    val city: String?,
    @SerializedName("state")
    val state: String?,
    @SerializedName("phone")
    val phone: String?,
    @SerializedName("postalCode")
    val postalCode: String?,
    @SerializedName("email")
    val email: String?,
    @SerializedName("latitud")
    val latitude: String?,
    @SerializedName("longitud")
    val longitude: String?,
    @SerializedName("dayVisit")
    val dayVisit: Int?,
    @SerializedName("ordenVisit")
    val orderVisit: Int?,
    @SerializedName("version")
    val version: Int?,
    @SerializedName("routeId")
    val routeId: Int ?,
    @SerializedName("typeVisit")
    val typeVisit: Int?,
    @SerializedName("typeClient")
    val typeClient: Int?,
    @SerializedName("giro")
    val business: Int?,
    @SerializedName("businessName")
    val businessName: String?,
    @SerializedName("classificationId")
    val classificationId: Int?,
    @SerializedName("clientActive")
    val clientActive: Int?,
    @SerializedName("actualizacion")
    val update: Int?,
    @SerializedName("bank")
    val bank: String?,
    @SerializedName("bankAccount")
    val bankAccount: String?,
    @SerializedName("authorizedModification")
    val authorizedModification: Int?,
    @SerializedName("dayReschedule")
    val dayReschedule: Int?,
    @SerializedName("orderReschedule")
    val orderReschedule: Int?,
    @SerializedName("dateRegister")
    val dateRegister: String?,
    val isSynced: Boolean = true,
    val isPendingNew: Boolean = false
)