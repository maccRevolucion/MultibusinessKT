package mx.diossa.multibusiness.presentation.features.charges

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import mx.diossa.multibusiness.data.local.entity.ChargesEntity
import mx.diossa.multibusiness.domain.repositories.ChargesRepository
import javax.inject.Inject

@HiltViewModel
class ChargesViewModel @Inject constructor(
    private val repository: ChargesRepository
) : ViewModel() {

    fun saveNewCharge(newCharge: ChargesEntity) {
        viewModelScope.launch {
            repository.createNewCharge(newCharge)
            repository.syncPendingCharges()
        }
    }

    fun refreshCharges(routeId: Int) {
        viewModelScope.launch {
            repository.fetchCharges(routeId)
        }
    }
}