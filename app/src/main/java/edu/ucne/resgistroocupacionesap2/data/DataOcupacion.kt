package edu.ucne.resgistroocupacionesap2.data

import androidx.room.Database
import androidx.room.RoomDatabase
import edu.ucne.resgistroocupacionesap2.data.dao.OcupacionDao
import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion


@Database(
    entities = [Ocupacion::class],
    version = 1
)
abstract class DataOcupacion: RoomDatabase() {

    abstract val ocupacionDao: OcupacionDao
}