package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceExhibitors
import mx.diossa.multibusiness.data.remote.dto.ApiResponseExhibitors
import javax.inject.Inject

class ExhibitorsRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceExhibitors
) {
    suspend fun getExhibitors(): ApiResponseExhibitors = apiService.getExhibitors()
}