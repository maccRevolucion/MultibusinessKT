package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.FuelTicketEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceFuel
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFuel
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFuelVoucher
import javax.inject.Inject

class FuelRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceFuel
) {
    suspend fun getFuel(idRoute: Int): ApiResponseFuelVoucher = apiService.getFuel(idRoute)
    suspend fun postFuel(request: List<FuelTicketEntity>): ApiResponseFuel = apiService.postFuel(request)
}