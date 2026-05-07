package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceCatalogueCFDI
import mx.diossa.multibusiness.data.remote.dto.ApiResponseCatalogue
import javax.inject.Inject

class CatalogueRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceCatalogueCFDI
) {
    suspend fun getCatalogue(): ApiResponseCatalogue = apiService.getCatalogueCfdi()
}