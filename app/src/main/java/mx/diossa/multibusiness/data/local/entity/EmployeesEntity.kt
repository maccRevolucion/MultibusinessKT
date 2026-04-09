package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("employeesEntity")
data class EmployeesEntity(
    @PrimaryKey @SerializedName("id_empleado")
    val employeeId: Int,
    @SerializedName("id_puesto")
    val jobId: Int,
    @SerializedName("limite_credito")
    val creditLimit: Double,
    @SerializedName("empleado")
    val employee: String,
    @SerializedName("id_ruta")
    val routeId: Int,
    @SerializedName("id_lista_precio_por_ruta")
    val priceListByRouteId: Int,
    @SerializedName("ruta")
    val route: Int,
    @SerializedName("tipo_mercado")
    val marketType: Int,
    @SerializedName("usuario")
    val user: String,
    @SerializedName("contrasenia")
    val password: String,
    @SerializedName("fecha")
    val date: String
)
