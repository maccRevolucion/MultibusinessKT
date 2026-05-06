package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.ClientEntity
import mx.diossa.multibusiness.data.local.entity.ClientAuthorizationEntity
import mx.diossa.multibusiness.data.local.entity.ClientClassificationEntity
import mx.diossa.multibusiness.data.local.entity.ClientRescheduleEntity
import mx.diossa.multibusiness.data.local.entity.ClientsProductsBonifications


data class ApiResponseClient(
    val data: List<ClientEntity>,
    val message: String?
)

data class ApiResponseClientAuthorization(
    val data: List<ClientAuthorizationEntity>,
    val message: String?
)

data class ApiResponseClientClassification(
    val data: List<ClientClassificationEntity>,
    val message: String?
)

data class ApiResponseClientRescheduleEntity(
    val data: List<ClientRescheduleEntity>,
    val message: String?
)

data class ApiResponseClientProductsBonifications(
    val data: List<ClientsProductsBonifications>,
    val message: String?
)

