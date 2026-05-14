package mx.diossa.multibusiness.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow
import mx.diossa.multibusiness.data.local.entity.ChargesEntity


@Dao
interface ChargesDao {
    @Query("SELECT * FROM charges WHERE routeId = :routeId")
    fun getChargesByRoute(routeId: Int): Flow<List<ChargesEntity>>

    @Query("SELECT * FROM charges WHERE isSynced = 0")
    suspend fun getUnsyncedCharges(): List<ChargesEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCharges(charges: List<ChargesEntity>)

    @Update
    suspend fun updateCharge(charge: ChargesEntity)
}