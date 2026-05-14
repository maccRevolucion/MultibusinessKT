package mx.diossa.multibusiness.domain.repositories

import mx.diossa.multibusiness.data.local.datasource.CatalogueLocalDataSource
import mx.diossa.multibusiness.data.remote.datasource.CatalogueRemoteDataSource
import javax.inject.Inject

class CatalogueCfdiRepository @Inject constructor(
    private val remote: CatalogueRemoteDataSource,
    private val local: CatalogueLocalDataSource
) {
    val allCatalogueCfdi = local.getCatalogue()

    suspend fun syncCatalogueCfdi(): Result<Unit> {
        return try {
            val response = remote.getCatalogue()

            if (response.data != null) {
                local.saveCatalogue(response.data)
                Result.success(Unit)
            } else {
                Result.failure(Exception("No se recibieron datos del servidor"))
            }
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}