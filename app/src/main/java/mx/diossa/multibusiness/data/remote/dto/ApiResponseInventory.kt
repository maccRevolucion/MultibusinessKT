package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.InventoryCarryLetterEntity

data class ApiResponseInventory(
    val data: List<InventoryCarryLetterEntity>,
    val message: String?
)
