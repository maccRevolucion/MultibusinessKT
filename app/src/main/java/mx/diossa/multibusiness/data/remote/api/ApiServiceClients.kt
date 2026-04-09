package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClient
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientAuthorization
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientClassification
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientProductsBonifications
import mx.diossa.multibusiness.data.remote.dto.ApiResponseClientRescheduleEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseExhibitors
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiServiceClients {
    //CLIENTES
    @GET("api/route/{id_route}/clients")
    suspend fun getClients(@Path("id_route") idRoute: Int): ApiResponseClient

    //ENVIO DE NUEVOS/ACTUALIZAR CLIENTES
    @POST("") //TODO: poner URL del Post de clientes
    suspend fun postClients(@Body request: List<ClientEntity>): ApiResponseClient

    //CLASIFICACION DE CLIENTES
    @GET("api/client/clasification")
    suspend fun getClientClassification(): ApiResponseClientClassification

    //CREDITO AUTORIZADO
    @GET("api/route/{id_route}/authorizations")
    suspend fun getClientAuthorization(@Path("id_route") idRoute: Int): ApiResponseClientAuthorization

    //CLIENTES EXHIBIDORES
    @GET("api/route/{id_route}/exhibitors")
    suspend fun getClientExhibitors(@Path("id_route") idRoute: Int): ApiResponseExhibitors

    //CLIENTES FUERA DE RECORRIDO
    @GET("api/route/{id_route}/clients/outside_route")
    suspend fun getClientOutTravel(@Path("id_route") idRoute: Int): ApiResponseClient

    //CLIENTES REPROGRAMADOS
    @GET("api/clients/route/{id_route}/reschedule")
    suspend fun getClientReschedule(@Path("id_route") idRoute: Int): ApiResponseClientRescheduleEntity

    //CLIENTES CON BONIFICACIONES
    @GET("api/route/{id_route}/productsbonifications")
    suspend fun getClientBonification(@Path("id_route") idRoute: Int): ApiResponseClientProductsBonifications


}