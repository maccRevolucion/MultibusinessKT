package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.InitiativeEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceIniciative
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiative
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailApply
import mx.diossa.multibusiness.data.remote.dto.ApiResponseInitiativeDetailGenerate
import javax.inject.Inject

class IniciativeRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceIniciative
) {
    suspend fun getIniciative(): ApiResponseInitiative = apiService.getIniciative()

    suspend fun postIniciative(request: List<InitiativeEntity>): ApiResponseInitiative = apiService.postIniciative(request)

    suspend fun getIniciativeCuponDetail(): ApiResponseInitiativeDetailGenerate = apiService.getIniciativeCuponDetail()

    suspend fun getIniciativeCuponDetailApply(): ApiResponseInitiativeDetailApply = apiService.getIniciativeCuponDetailApply()
}