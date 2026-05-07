package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.DeviceEventEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseDevice
import retrofit2.http.Body
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface ApiServiceSynchronization {
    @PUT("api/route/{routeId}/confirm_sync")
    suspend fun putSynchronization(@Path("routeId") idRoute: Int,
                                   @Body request: DeviceEventEntity): ApiResponseDevice

    @POST("api/device_actions")
    suspend fun postSync(@Body request: DeviceEventEntity): ApiResponseDevice
}