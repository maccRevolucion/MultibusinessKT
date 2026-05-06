package mx.diossa.multibusiness.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity("debtChargeEntity")
data class DebtChargeEntity(
    @PrimaryKey
    @SerializedName("id_servicio")
    val idService: Int,
    @SerializedName("nombre")
    val name: String?,
    @SerializedName("id_claveprodserv")
    val idProduct: Int?,
    @SerializedName("costo_cobranza")
    val charge: Double?,
    @SerializedName("id_grupo_rutas")
    val idGroupRoute: Int?,
    @SerializedName("activo")
    val active: Boolean?,
    @SerializedName("usuario_registro")
    val userRegister: Int?,
    @SerializedName("fecha_registro")
    val dateRegister: String?,
    @SerializedName("tipo_credito")
    val typeCredit: Int?,
)