package mx.diossa.multibusiness.presentation.features.bank

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import mx.diossa.multibusiness.domain.repositories.BankRepository
import javax.inject.Inject

@HiltViewModel
class BankViewModel @Inject constructor(
    private val repository: BankRepository
) : ViewModel() {
    val allBanks = repository.allBanks.asLiveData()

    private val _isSyncing = MutableStateFlow(false)
    val isSyncing = _isSyncing.asStateFlow()

    private val _syncResult = MutableSharedFlow<String>()
    val syncResult = _syncResult.asSharedFlow()

    fun syncBanks() {
        viewModelScope.launch {
            _isSyncing.value = true
            val result = repository.syncBanks()

            result.onSuccess {
                _syncResult.emit("Bancos actualizados correctamente")
            }.onFailure { error ->
                _syncResult.emit("Error al actualizar bancos: ${error.message}")
            }

            _isSyncing.value = false
        }
    }
}