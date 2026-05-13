package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceEmployees
import mx.diossa.multibusiness.data.remote.dto.ApiResponseEmployees
import javax.inject.Inject

class EmployeesRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceEmployees
) {
    suspend fun getEmployees(idCedis: Int): ApiResponseEmployees = apiService.getEmployees(idCedis)
}