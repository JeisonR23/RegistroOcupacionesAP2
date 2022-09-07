package edu.ucne.resgistroocupacionesap2.presentation.OcupacionConsulta

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

data class OcupacionListVistaModelo(
    val ocupacion: List<Ocupacion> = emptyList(),
    val texto: String = "Meeting"
)

@HiltViewModel
class OcupacionListModelo @Inject constructor(
    val repository: OcupacionRepository
) : ViewModel() {

    private val _uiState = MutableStateFlow(OcupacionListVistaModelo())
    val uiState: StateFlow<OcupacionListVistaModelo> = _uiState.asStateFlow()

    init {
        viewModelScope.launch {
            repository.getOcupacion().collect { list ->
                _uiState.update {
                    it.copy( ocupacion = list )
                }
            }
        }
    }
}
