package mx.diossa.multibusiness.domain.repositories

import mx.diossa.multibusiness.data.local.datasource.ClientsLocalDataSource
import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.remote.datasource.ClientsRemoteDataSource
import javax.inject.Inject

class ClientsRepository @Inject constructor(
    private val remote: ClientsRemoteDataSource,
    private val local: ClientsLocalDataSource
) {
    fun getClientsFlow(idRoute: Int) = local.getClients(idRoute)
    suspend fun syncAllClientData(idRoute: Int): Result<Unit> {
        return try {
            // Sincronizar y guardar Clientes
            val clients = remote.getClients(idRoute)
            local.saveClients(clients.data)

            // Clasificaciones (Catálogo general)
            val classifications = remote.getClientClassification()
            local.saveClassifications(classifications.data)

            // Autorizaciones de Crédito
            val auths = remote.getClientAuthorization(idRoute)
            local.saveAuthorizations(auths.data)

            // CLientes con Bonificaciones
            val bonifications = remote.getClientBonification(idRoute)
            local.saveBonifications(bonifications.data)

            // Exhibidores y Reprogramados
            val exhibitors = remote.getClientExhibitors(idRoute)
            local.saveExhibitors(exhibitors.data)

            val reschedules = remote.getClientReschedule(idRoute)
            local.saveReschedules(reschedules.data)

            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    // POST de clientes
    suspend fun uploadClients(clients: List<ClientEntity>): Result<Unit> {
        return try {
            val response = remote.postClients(clients)
            Result.success(Unit)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}