package edu.ucne.resgistroocupacionesap2.presentation.OcupacionConsulta

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import edu.ucne.resgistroocupacionesap2.Domain.model.Ocupacion


@Composable
fun OcupacionList(
    onClick: () -> Unit,
    viewModel: OcupacionListModelo = hiltViewModel()
) {

    Scaffold(
        topBar = {

        },
        floatingActionButton = {
            FloatingActionButton(onClick = onClick) {
                Icon(imageVector = Icons.Default.Add, contentDescription = "Add Ocupacion")
            }
        }
    ) {

        val uiState by viewModel.uiState.collectAsState()

        Column(modifier = Modifier
            .fillMaxWidth()
            .padding(it)) {

            OcupacionList(
                ocupaciones = uiState.ocupacion,
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it)
            )
        }

    }

}



@Composable
fun OcupacionList(
    ocupaciones: List<Ocupacion>,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(ocupaciones) { ocupacion ->
            OcupacionRow(ocupacion)
        }
    }
}

@Composable
fun OcupacionRow(ocupacion: Ocupacion) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(4.dp)
    ) {
        Text(
            text = ocupacion.Descripcion,
            style = MaterialTheme.typography.h3
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = ocupacion.Salario.toString())
            Text(
                text = "Salario: ${ocupacion.Salario}"
            )

        }
        Divider(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 4.dp),
            color = Color.LightGray
        )
    }
}
