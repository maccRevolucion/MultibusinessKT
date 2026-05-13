package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceLines
import mx.diossa.multibusiness.data.remote.dto.ApiResponseLines
import javax.inject.Inject

class LinesRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceLines
) {
    suspend fun getLines(): ApiResponseLines = apiService.getLines()
}