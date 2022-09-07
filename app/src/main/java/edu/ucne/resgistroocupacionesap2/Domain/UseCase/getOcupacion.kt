package edu.ucne.resgistroocupacionesap2.Domain.UseCase

import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class getOcupation @Inject constructor(
    private val repository : OcupacionRepository
) {

    operator  fun  invoke() : Flow<List<Ocupacion>>?
    {
        return repository.getOcupacion()
    }

}