package edu.ucne.resgistroocupacionesap2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import edu.ucne.resgistroocupacionesap2.presentation.OcupacionConsulta.OcupacionList
import edu.ucne.resgistroocupacionesap2.presentation.OcupacionRegistro.OcupacionScreen


import edu.ucne.resgistroocupacionesap2.ui.theme.ResgistroOcupacionesAP2Theme
import edu.ucne.resgistroocupacionesap2.util.ScreenOcu


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ResgistroOcupacionesAP2Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    /*color = MaterialTheme.colorScheme.background*/
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = ScreenOcu.OcupacionList.route
                    ) {
                        composable(ScreenOcu.OcupacionList.route) {
                            OcupacionList(

                                onClick = { navController.navigate(ScreenOcu.OcupacionScreen.route) }
                            )
                        }
                        composable(ScreenOcu.OcupacionScreen.route) {
                            OcupacionScreen({ navController.navigateUp() })
                        }
                    }

                }


            }
        }
    }
}


