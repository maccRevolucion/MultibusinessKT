package mx.diossa.multibusiness.data.local.datasource

import mx.diossa.multibusiness.data.local.dao.ChargesDao
import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import javax.inject.Inject

class ChargesLocalDataSource @Inject constructor(private val dao: ChargesDao) {
    fun getCharges(routeId: Int) = dao.getChargesByRoute(routeId)

    suspend fun saveChargesFromServer(charges: List<ChargesEntity>) {
        dao.insertCharges(charges.map { it.copy(isSynced = true) })
    }

    suspend fun createNewCharge(charge: ChargesEntity) {
        dao.insertCharges(listOf(charge.copy(isSynced = false)))
    }

    suspend fun getPendingCharges() = dao.getUnsyncedCharges()

    suspend fun markAsSynced(charges: List<ChargesEntity>) {
        dao.insertCharges(charges.map { it.copy(isSynced = true) })
    }
}