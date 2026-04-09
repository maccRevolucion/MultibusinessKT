package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.InventoryCarryLetterEntity

data class ApiResponseInventory(
    val data: InventoryCarryLetterEntity,
    val message: String
)
