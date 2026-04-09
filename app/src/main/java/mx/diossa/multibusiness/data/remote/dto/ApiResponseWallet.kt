package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.MonederoAsociacionEntity
import mx.diossa.multibusiness.data.local.entity.MonederoEntity

data class ApiResponseWallet(
    val data: MonederoEntity,
    val message: String
)

data class ApiResponseAssociationWallet(
    val data: MonederoAsociacionEntity,
    val message: String
)
