package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServicePayments
import mx.diossa.multibusiness.data.remote.dto.ApiResponsePayments
import javax.inject.Inject

class PaymentsRemoteDataSource @Inject constructor(
    private val apiService: ApiServicePayments
) {
    suspend fun getPayments(idRoute: Int): ApiResponsePayments = apiService.getPayment(idRoute)
}