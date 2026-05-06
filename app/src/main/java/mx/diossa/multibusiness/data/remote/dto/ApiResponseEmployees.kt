package mx.diossa.multibusiness.data.remote.dto

import mx.diossa.multibusiness.data.local.entity.EmployeesEntity

data class ApiResponseEmployees(
    val data: List<EmployeesEntity>,
    val message: String?
)
