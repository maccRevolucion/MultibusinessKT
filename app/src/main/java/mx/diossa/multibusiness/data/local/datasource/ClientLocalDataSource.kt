package mx.diossa.multibusiness.data.local.datasource

import mx.diossa.multibusiness.data.local.dao.ClientDao
import mx.diossa.multibusiness.data.local.entity.ClientAuthorizationEntity
import mx.diossa.multibusiness.data.local.entity.ClientClassificationEntity
import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.local.entity.ClientRescheduleEntity
import mx.diossa.multibusiness.data.local.entity.ClientsProductsBonifications
import mx.diossa.multibusiness.data.local.entity.ExhibitorsEntity
import javax.inject.Inject

class ClientsLocalDataSource @Inject constructor(
    private val clientDao: ClientDao
) {
    fun getClients(idRoute: Int) = clientDao.getClientsByRoute(idRoute)

    //Persistencia de datos en ROOM
    suspend fun saveClients(list: List<ClientEntity>) = clientDao.insertClients(list)
    suspend fun saveClassifications(list: List<ClientClassificationEntity>) = clientDao.insertClassifications(list)
    suspend fun saveAuthorizations(list: List<ClientAuthorizationEntity>) = clientDao.insertAuthorizations(list)
    suspend fun saveExhibitors(list: List<ExhibitorsEntity>) = clientDao.insertExhibitors(list)
    suspend fun saveBonifications(list: List<ClientsProductsBonifications>) = clientDao.insertBonifications(list)
    suspend fun saveReschedules(list: List<ClientRescheduleEntity>) = clientDao.insertReschedules(list)
}