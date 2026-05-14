package mx.diossa.multibusiness.presentation.features.cedis

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import mx.diossa.multibusiness.domain.repositories.CedisRepository
import javax.inject.Inject

@HiltViewModel
class CedisViewModel @Inject constructor(
    private val repository: CedisRepository
) : ViewModel() {
    val currentCedis = repository.currentCedis.asLiveData()

    private val _uiState = MutableStateFlow<CedisUiState>(CedisUiState.Idle)
    val uiState = _uiState.asStateFlow()

    fun syncNewCedis(idCedis: Int) {
        viewModelScope.launch {
            _uiState.value = CedisUiState.Loading

            val result = repository.syncCedis(idCedis)

            result.onSuccess {
                _uiState.value = CedisUiState.Success
            }.onFailure { error ->
                _uiState.value = CedisUiState.Error(error.message ?: "Error desconocido")
            }
        }
    }
}

sealed class CedisUiState {
    object Idle : CedisUiState()
    object Loading : CedisUiState()
    object Success : CedisUiState()
    data class Error(val message: String) : CedisUiState()
}