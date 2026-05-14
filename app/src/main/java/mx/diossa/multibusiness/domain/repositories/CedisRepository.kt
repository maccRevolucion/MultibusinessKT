package mx.diossa.multibusiness.domain.repositories

import android.content.Context
import mx.diossa.multibusiness.core.utils.getAppVersionName
import mx.diossa.multibusiness.data.local.datasource.CedisLocalDataSource
import mx.diossa.multibusiness.data.remote.datasource.CedisRemoteDataSource
import javax.inject.Inject

class CedisRepository @Inject constructor(
    private val remote: CedisRemoteDataSource,
    private val local: CedisLocalDataSource,
    private val context: Context
) {
    val currentCedis = local.cedis

    suspend fun syncCedis(idCedis: Int): Result<Unit> {
        return try {
            val version = getAppVersionName(context) ?: "unknown"

            // 2. Llamamos a la API
            val response = remote.getCedisInfo(idCedis, version)

            if (response.data != null) {
                local.saveCedis(response.data)
                Result.success(Unit)
            } else {
                Result.failure(Exception("Cedis no encontrado o versión no compatible"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}