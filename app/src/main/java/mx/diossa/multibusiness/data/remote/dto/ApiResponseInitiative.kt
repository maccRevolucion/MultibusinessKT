package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.InitiativeDetailApplyEntity
import mx.diossa.multibusiness.data.local.entity.InitiativeDetailGenerateEntity
import mx.diossa.multibusiness.data.local.entity.InitiativeEntity

data class ApiResponseInitiative(
    val data: InitiativeEntity,
    val message: String
)

data class ApiResponseInitiativeDetailApply(
    val data: InitiativeDetailApplyEntity,
    val message: String
)

data class ApiResponseInitiativeDetailGenerate(
    val data: InitiativeDetailGenerateEntity,
    val message: String
)

