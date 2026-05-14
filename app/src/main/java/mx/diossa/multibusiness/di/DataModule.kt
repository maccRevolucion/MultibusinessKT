package mx.diossa.multibusiness.di

import android.content.Context
import androidx.room.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import mx.diossa.multibusiness.data.AppDatabase
import mx.diossa.multibusiness.data.local.dao.BankDao
import mx.diossa.multibusiness.data.local.dao.CatalogueDao
import mx.diossa.multibusiness.data.local.dao.CedisDao
import mx.diossa.multibusiness.data.local.dao.ChargesDao
import mx.diossa.multibusiness.data.local.dao.ClientDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context): AppDatabase{
        return Room.databaseBuilder(
                context,
                AppDatabase::class.java, "app_database"
            ).fallbackToDestructiveMigration(false)
            .build()
    }

    //Bancos
    @Provides
    @Singleton
    fun provideBankDao(database: AppDatabase): BankDao = database.bankDao()

    //Cedis Info
    @Provides
    @Singleton
    fun provideCedisInfo(database: AppDatabase): CedisDao = database.cedisDao()

    //Catalogo Cfdi
    @Provides
    @Singleton
    fun provideCatalogueCfdi(database: AppDatabase): CatalogueDao = database.catalogueDao()

    //Cargos
    @Provides
    @Singleton
    fun provideCharges(database: AppDatabase): ChargesDao = database.chargesDao()

    //Clientes
    @Provides
    @Singleton
    fun provideClients(database: AppDatabase): ClientDao = database.clientDao()
}