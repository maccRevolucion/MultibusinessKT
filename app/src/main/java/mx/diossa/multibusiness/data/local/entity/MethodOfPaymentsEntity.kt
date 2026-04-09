package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("methodOfPaymentsEntity")
data class MethodOfPaymentsEntity(
    @PrimaryKey @SerializedName ("id_metodo_pago")
    val methodPaymentId: String,
    @SerializedName("nombre")
    val name: String,
    @SerializedName("clave_sat")
    val satKey: String,
    @SerializedName("requiere_datos")
    val dataEequires: Int,
    @SerializedName("activo")
    val active: Int
)
