package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceBank
import mx.diossa.multibusiness.data.remote.dto.ApiResponseBank
import javax.inject.Inject

class BankRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceBank
){
    suspend fun getBanks() = apiService.getBanks()
}