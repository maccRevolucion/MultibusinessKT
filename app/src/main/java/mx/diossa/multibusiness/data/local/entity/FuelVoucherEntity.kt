package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("fuelVoucherEntity")
data class FuelVoucherEntity(
    @PrimaryKey
    @SerializedName("id_combustible_vale")
    val fuelVoucherId: Int,
    @SerializedName("fecha")
    val date: String?,
    @SerializedName("id_empleado")
    val employeeId: Int?,
    @SerializedName("id_ruta")
    val routeId: Int?,
    @SerializedName("id_vehiculo")
    val vehicleId: Int?,
    @SerializedName("placas")
    val placas: String?,
    @SerializedName("id_combustible")
    val fuelId: Int?,
    @SerializedName("id_proveedor")
    val providerId: Int?,
    @SerializedName("tipo_vale")
    val voucherType: String?,
    @SerializedName("litros")
    val litros: Float?,
    @SerializedName("fecha_registro")
    val dateRegister: String?,
    @SerializedName("usuario_registro")
    val userRegister: Int?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("impresiones")
    val impresiones: Int?,
    @SerializedName("id_autorizo")
    val authorizationId: Int?,
    @SerializedName("obeservaciones")
    val observations: String?,
    @SerializedName("fecha_hora")
    val dateHour: String?

)
