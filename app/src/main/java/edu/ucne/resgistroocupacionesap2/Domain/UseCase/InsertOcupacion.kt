package edu.ucne.resgistroocupacionesap2.Domain.UseCase

import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import javax.inject.Inject

class InsertOcupation @Inject constructor(
    private val repository : OcupacionRepository
) {


    suspend operator  fun  invoke( ocupacion: Ocupacion)
    {
        repository.insertOcupacion(ocupacion)
    }

}