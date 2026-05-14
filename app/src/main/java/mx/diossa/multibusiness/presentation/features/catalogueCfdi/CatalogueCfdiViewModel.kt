package mx.diossa.multibusiness.presentation.features.catalogueCfdi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import mx.diossa.multibusiness.domain.repositories.CatalogueCfdiRepository
import javax.inject.Inject

@HiltViewModel
class CatalogueCfdiViewModel @Inject constructor(
    private val repository: CatalogueCfdiRepository
) : ViewModel(){
    val allCatalogueCfdi = repository.allCatalogueCfdi.asLiveData()

    private val _isSyncing = MutableStateFlow(false)
    val isSyncing = _isSyncing.asStateFlow()

    private val _syncResult = MutableSharedFlow<String>()
    val syncResult = _syncResult.asSharedFlow()

    fun syncCatalogueCfdi() {
        viewModelScope.launch {
            _isSyncing.value = true
            val result = repository.syncCatalogueCfdi()
            result.onSuccess {
                _syncResult.emit("CatalogoCfdi actualizado correctamente")
            }.onFailure { error ->
                _syncResult.emit("Error al actualizar catalogosCfdi: ${error.message}")
            }

            _isSyncing.value = false
        }
    }
}