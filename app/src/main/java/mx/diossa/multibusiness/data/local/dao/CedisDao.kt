package mx.diossa.multibusiness.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mx.diossa.multibusiness.data.local.entity.CedisEntity

@Dao
interface CedisDao {
    @Query("SELECT * FROM cedis LIMIT 1")
    fun getCedis(): Flow<CedisEntity?>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCedis(cedis: CedisEntity)

    @Query("DELETE FROM cedis")
    suspend fun deleteCedis()
}