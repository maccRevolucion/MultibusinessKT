package mx.diossa.multibusiness.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import mx.diossa.multibusiness.data.remote.api.ApiService
import mx.diossa.multibusiness.data.remote.api.ApiServiceBank
import mx.diossa.multibusiness.data.remote.api.ApiServiceCatalogueCFDI
import mx.diossa.multibusiness.data.remote.api.ApiServiceCedis
import mx.diossa.multibusiness.data.remote.api.ApiServiceClients
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    private const val BASE_URL = "http://172.16.5.6:8000/"

    @Provides
    @Singleton
    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    @Provides
    @Singleton
    fun provideOkHttpClient(
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build()

    //SERVICIOS
    //Bancos
    @Provides
    @Singleton
    fun provideBankApi(retrofit: Retrofit): ApiServiceBank =
        retrofit.create(ApiServiceBank::class.java)

    //Cedis
    @Provides
    @Singleton
    fun provideCedisApi(retrofit: Retrofit): ApiServiceCedis =
        retrofit.create(ApiServiceCedis::class.java)

    //Catalogo Cfdi
    @Provides
    @Singleton
    fun provideCatalogueApi(retrofit: Retrofit): ApiServiceCatalogueCFDI =
        retrofit.create(ApiServiceCatalogueCFDI::class.java)

    //Clientes
    @Provides
    @Singleton
    fun provideClients(retrofit: Retrofit): ApiServiceClients =
        retrofit.create(ApiServiceClients::class.java)
}