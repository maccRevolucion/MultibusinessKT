package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.FuelTicketEntity
import mx.diossa.multibusiness.data.local.entity.FuelVoucherEntity

data class ApiResponseFuel(
    val data: FuelTicketEntity,
    val message: String
)

data class ApiResponseFuelVoucher(
    val data: FuelVoucherEntity,
    val message: String
)

