package mx.diossa.multibusiness.data.local.datasource

import mx.diossa.multibusiness.data.local.dao.CedisDao
import mx.diossa.multibusiness.data.local.entity.CedisEntity
import javax.inject.Inject

class CedisLocalDataSource @Inject constructor(private val dao: CedisDao) {
    val cedis = dao.getCedis()
    suspend fun saveCedis(entity: CedisEntity) {
        dao.deleteCedis()
        dao.insertCedis(entity)
    }
}