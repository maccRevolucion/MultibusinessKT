package mx.diossa.multibusiness.domain.repositories

import mx.diossa.multibusiness.data.local.datasource.ChargesLocalDataSource
import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import mx.diossa.multibusiness.data.remote.datasource.ChargesRemoteDataSource
import javax.inject.Inject

class ChargesRepository @Inject constructor(
    private val remote: ChargesRemoteDataSource,
    private val local: ChargesLocalDataSource
) {
    val allCharges = { routeId: Int -> local.getCharges(routeId) }

    suspend fun fetchCharges(routeId: Int): Result<Unit> {
        return try {
            val response = remote.getCharges(routeId)
            local.saveChargesFromServer(response.data)
            Result.success(Unit)
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun syncPendingCharges(): Result<Unit> {
        return try {
            val pending = local.getPendingCharges()
            if (pending.isNotEmpty()) {
                val response = remote.postCharges(pending)
                local.markAsSynced(pending)
            }
            Result.success(Unit)
        } catch (e: Exception) { Result.failure(e) }
    }

    suspend fun createNewCharge(charge: ChargesEntity) {
        val pendingCharge = charge.copy(isSynced = false)
        local.createNewCharge(pendingCharge)
    }
}