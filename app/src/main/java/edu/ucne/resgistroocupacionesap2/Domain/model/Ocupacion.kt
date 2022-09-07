package edu.ucne.resgistroocupacionesap2.Domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Ocupacion(

    @PrimaryKey(autoGenerate = true) val OcupacionId:Int? = null,
    val Descripcion: String,
    val Salario: Double
)
