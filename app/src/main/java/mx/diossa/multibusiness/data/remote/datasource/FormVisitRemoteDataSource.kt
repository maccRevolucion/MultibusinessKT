package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceForm
import mx.diossa.multibusiness.data.remote.dto.ApiResponseForm
import javax.inject.Inject

class FormVisitRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceForm
) {
    suspend fun getForm(): ApiResponseForm = apiService.getForm()
}