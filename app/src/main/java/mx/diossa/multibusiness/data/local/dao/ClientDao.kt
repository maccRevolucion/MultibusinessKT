package mx.diossa.multibusiness.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow
import mx.diossa.multibusiness.data.local.entity.ClientAuthorizationEntity
import mx.diossa.multibusiness.data.local.entity.ClientClassificationEntity
import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.local.entity.ClientRescheduleEntity
import mx.diossa.multibusiness.data.local.entity.ClientsProductsBonifications
import mx.diossa.multibusiness.data.local.entity.ExhibitorsEntity

@Dao
interface ClientDao {
    @Query("SELECT * FROM client WHERE routeId = :idRoute")
    fun getClientsByRoute(idRoute: Int): Flow<List<ClientEntity>>

    @Query("SELECT * FROM clientAuthorization")
    fun getAuthorizations(): Flow<List<ClientAuthorizationEntity>>

    @Query("SELECT * FROM clientsProductsBonifications WHERE clientId = :clientId")
    fun getBonificationsByClient(clientId: Int): Flow<List<ClientsProductsBonifications>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClients(clients: List<ClientEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertClassifications(list: List<ClientClassificationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAuthorizations(list: List<ClientAuthorizationEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertExhibitors(list: List<ExhibitorsEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBonifications(list: List<ClientsProductsBonifications>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertReschedules(list: List<ClientRescheduleEntity>)

    @Query("DELETE FROM client")
    suspend fun clearClients()
}