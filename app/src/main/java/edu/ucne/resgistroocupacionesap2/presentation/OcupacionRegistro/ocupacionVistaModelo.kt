package edu.ucne.resgistroocupacionesap2.presentation.OcupacionRegistro

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class OcupacionViewModel @Inject constructor(
    val repository: OcupacionRepository
) : ViewModel() {

    var descripcion by mutableStateOf("")
    var salario by mutableStateOf("")

    fun Save(){
        viewModelScope.launch {

            repository.insertOcupacion(
                Ocupacion(
                    Descripcion = descripcion,
                    Salario = salario.toDouble()
                )
            )
        }
    }
}