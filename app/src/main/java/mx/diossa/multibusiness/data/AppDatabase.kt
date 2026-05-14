package mx.diossa.multibusiness.data

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import mx.diossa.multibusiness.core.utils.Converters
import mx.diossa.multibusiness.data.local.dao.BankDao
import mx.diossa.multibusiness.data.local.dao.CatalogueDao
import mx.diossa.multibusiness.data.local.dao.CedisDao
import mx.diossa.multibusiness.data.local.dao.ChargesDao
import mx.diossa.multibusiness.data.local.dao.ClientDao
import mx.diossa.multibusiness.data.local.entity.BankEntity
import mx.diossa.multibusiness.data.local.entity.CatalogueCfdiEntity
import mx.diossa.multibusiness.data.local.entity.CedisEntity
import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import mx.diossa.multibusiness.data.local.entity.ClientAuthorizationEntity
import mx.diossa.multibusiness.data.local.entity.ClientClassificationEntity
import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.local.entity.ClientRescheduleEntity
import mx.diossa.multibusiness.data.local.entity.ClientsExhibitors
import mx.diossa.multibusiness.data.local.entity.ClientsProductsBonifications

@Database(entities = [BankEntity::class,
    CedisEntity::class,
    CatalogueCfdiEntity::class,
    ChargesEntity::class,
    ClientEntity::class,
    ClientRescheduleEntity::class,
    ClientClassificationEntity::class,
    ClientsProductsBonifications::class,
    ClientAuthorizationEntity::class,
    ClientsExhibitors::class],
    version = 2, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun bankDao(): BankDao
    abstract fun cedisDao(): CedisDao
    abstract fun catalogueDao(): CatalogueDao
    abstract fun chargesDao(): ChargesDao
    abstract fun clientDao(): ClientDao
}