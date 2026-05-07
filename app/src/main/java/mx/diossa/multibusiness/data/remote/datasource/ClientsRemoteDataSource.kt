package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.remote.api.ApiServiceClients
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClient
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientAuthorization
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientClassification
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientProductsBonifications
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientRescheduleEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseExhibitors
import javax.inject.Inject

class ClientsRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceClients
) {
    suspend fun getClients(idRoute: Int): ApiResponseClient = apiService.getClients(idRoute)

    suspend fun postClients(request: List<ClientEntity>): ApiResponseClient = apiService.postClients(request)

    suspend fun getClientClassification(): ApiResponseClientClassification = apiService.getClientClassification()

    suspend fun getClientAuthorization(idRoute: Int): ApiResponseClientAuthorization = apiService.getClientAuthorization(idRoute)

    suspend fun getClientExhibitors(idRoute: Int): ApiResponseExhibitors = apiService.getClientExhibitors(idRoute)

    suspend fun getClientOutTravel(idRoute: Int): ApiResponseClient = apiService.getClientOutTravel(idRoute)

    suspend fun getClientReschedule(idRoute: Int): ApiResponseClientRescheduleEntity = apiService.getClientReschedule(idRoute)

    suspend fun getClientBonification(idRoute: Int): ApiResponseClientProductsBonifications = apiService.getClientBonification(idRoute)
}