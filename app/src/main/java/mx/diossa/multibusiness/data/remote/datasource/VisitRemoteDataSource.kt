package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.VisitEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceVisit
import mx.diossa.multibusiness.data.remote.dto.ApiResponseVisit
import javax.inject.Inject

class VisitRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceVisit
) {
    suspend fun postVisit(request: List<VisitEntity>): ApiResponseVisit = apiService.postVisit(request)
}