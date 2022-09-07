package edu.ucne.resgistroocupacionesap2.data.dao

import androidx.room.*
import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion
import kotlinx.coroutines.flow.Flow


@Dao
interface OcupacionDao {

    @Query(value = "SELECT * FROM Ocupacion")
    fun getOcupacion(): Flow<List<Ocupacion>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertOcupacion(ocupacion: Ocupacion)


}