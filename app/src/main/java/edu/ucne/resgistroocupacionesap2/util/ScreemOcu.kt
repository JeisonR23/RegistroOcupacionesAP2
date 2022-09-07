package edu.ucne.resgistroocupacionesap2.util

sealed class ScreenOcu(val route: String){
    object OcupacionList: ScreenOcu("OcupacionList")
    object OcupacionScreen: ScreenOcu("Ocupacion")
}