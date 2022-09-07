package edu.ucne.resgistroocupacionesap2.Domain.repository

import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import kotlinx.coroutines.flow.Flow

interface OcupacionRepository {

    fun getOcupacion(): Flow<List<Ocupacion>>

     fun insertOcupacion(ocupacion: Ocupacion)


}