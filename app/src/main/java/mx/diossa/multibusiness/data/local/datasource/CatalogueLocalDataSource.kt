package mx.diossa.multibusiness.data.local.datasource

import mx.diossa.multibusiness.data.local.dao.CatalogueDao
import mx.diossa.multibusiness.data.local.entity.CatalogueCfdiEntity
import javax.inject.Inject

class CatalogueLocalDataSource @Inject constructor(
    private val catalogueDao: CatalogueDao
){
    fun getCatalogue() = catalogueDao.getCatalogueCfdi()

    suspend fun saveCatalogue(catalogue: List<CatalogueCfdiEntity>){
        catalogueDao.insertCatalogue(catalogue)
    }
}