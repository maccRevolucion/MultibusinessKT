package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.FoliosEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceFolios
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDataCarry
import mx.diossa.multibusiness.data.remote.dto.ApiResponseFolios
import javax.inject.Inject

class FoliosRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceFolios
) {
    suspend fun getFolios(idRoute: Int): ApiResponseFolios = apiService.getFolios(idRoute)
    suspend fun postFolios(idRoute: Int, request: List<FoliosEntity>): ApiResponseFolios = apiService.postFolios(idRoute, request)
}