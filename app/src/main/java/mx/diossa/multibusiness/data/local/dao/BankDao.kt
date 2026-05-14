package mx.diossa.multibusiness.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mx.diossa.multibusiness.data.local.entity.BankEntity

@Dao
interface BankDao {
    @Query("SELECT * FROM bank")
    fun getAllBanks(): Flow<List<BankEntity>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBanks(banks: List<BankEntity>)

    @Query("DELETE FROM bank")
    suspend fun deleteAllBanks()
}