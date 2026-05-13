package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceInventory
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInventory
import javax.inject.Inject

class InventoryCarryRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceInventory
) {
    suspend fun getInventory(idRoute: Int): ApiResponseInventory = apiService.getInventory(idRoute)
}