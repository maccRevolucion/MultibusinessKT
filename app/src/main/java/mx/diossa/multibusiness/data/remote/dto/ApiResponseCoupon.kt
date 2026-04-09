package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.CouponEntity
import mx.diossa.multibusiness.data.local.entity.CouponApplicationDetail
import mx.diossa.multibusiness.data.local.entity.CouponApplicationEntity
import mx.diossa.multibusiness.data.local.entity.CouponDetailEntity

data class ApiResponseCoupon(
    val data: CouponEntity,
    val message: String
)

data class ApiResponseCouponApplicationDetail(
    val data: CouponApplicationDetail,
    val message: String
)

data class ApiResponseCouponApplication(
    val data: CouponApplicationEntity,
    val message: String
)

data class ApiResponseCouponDetailEntity(
    val data: CouponDetailEntity,
    val message: String
)



