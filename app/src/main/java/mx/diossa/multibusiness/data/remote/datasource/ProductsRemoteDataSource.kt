package mx.diossa.multibusiness.data.remote.datasource

import mx.diossa.multibusiness.data.remote.api.ApiServiceProducts
import javax.inject.Inject

class ProductsRemoteDataSource @Inject constructor(
    private val apiService: ApiServiceProducts
) {
}