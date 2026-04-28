package mx.diossa.multibusiness.data.remote.api

import mx.diossa.multibusiness.data.local.entity.VisitEntity
import mx.diossa.multibusiness.data.remote.dto.ApiResponseVisit
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiServiceVisit {
    //
    @POST("api/visit")
    suspend fun postVisit(@Body request: List<VisitEntity>): ApiResponseVisit
}