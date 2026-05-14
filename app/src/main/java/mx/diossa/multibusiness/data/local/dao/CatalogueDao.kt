package mx.diossa.multibusiness.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mx.diossa.multibusiness.data.local.entity.CatalogueCfdiEntity

@Dao
interface CatalogueDao {
    @Query("SELECT * FROM catalogueCfdi")
    fun getCatalogueCfdi(): Flow<CatalogueCfdiEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCatalogue(catalogueDao: List<CatalogueCfdiEntity>)

    @Query("DELETE FROM catalogueCfdi")
    suspend fun deleteCatalogue()
}