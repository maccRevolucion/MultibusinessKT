package mx.diossa.multibusiness.data.local.entity

data class CouponEntity(
    val couponId: Int,
    val receiveNumber: String,
    val initiativeId: Int,
    val couponDetailEntities: List<CouponDetailEntity>,
    val amount: Float,
    val date: String,
    val time: String,
    val active: Int,
    val saleReceiveNumberUse: String,
    val saleReceiveNumberGenerated: String,
)