package mx.diossa.multibusiness.domain.repositories

import mx.diossa.multibusiness.data.local.datasource.BankLocalDataSource
import mx.diossa.multibusiness.data.remote.datasource.BankRemoteDataSource
import javax.inject.Inject

class BankRepository @Inject constructor(
    private val remote: BankRemoteDataSource,
    private val local: BankLocalDataSource
) {
    val allBanks = local.getBanks()

    suspend fun syncBanks(): Result<Unit> {
        return try {
            val response = remote.getBanks()

            if (response.data != null) {
                local.saveBanks(response.data)
                Result.success(Unit)
            } else {
                Result.failure(Exception("No se recibieron datos del servidor"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}