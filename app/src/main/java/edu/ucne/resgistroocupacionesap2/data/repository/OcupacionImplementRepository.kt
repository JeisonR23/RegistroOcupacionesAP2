package edu.ucne.resgistroocupacionesap2.data.repository

import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import edu.ucne.resgistroocupacionesap2.Domain.repository.OcupacionRepository
import edu.ucne.resgistroocupacionesap2.data.dao.OcupacionDao
import kotlinx.coroutines.flow.Flow

class OcupationRepositoryImpl(
    private  val dao :  OcupacionDao
):OcupacionRepository {

    override fun getOcupacion(): Flow<List<Ocupacion>> {
        return dao.getOcupacion()
    }

    override fun insertOcupacion(ocupacion: Ocupacion) {
        dao.insertOcupacion(ocupacion)
    }

}
