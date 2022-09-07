package edu.ucne.resgistroocupacionesap2.presentation.OcupacionRegistro

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun OcupacionScreen(
    onNavigateBack: () -> Unit,
    viewModel: OcupacionViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            Text(text = "Registro De Ocupaciones")
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                viewModel.Save()
                onNavigateBack()
            }) {
                Icon(imageVector = Icons.Default.Create, contentDescription = "Add a Ocupacion")
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
                .padding(8.dp)
        ) {

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Descripcion") },
                value = viewModel.descripcion,
                onValueChange = { viewModel.descripcion = it })

            OutlinedTextField(
                modifier = Modifier.fillMaxWidth(),
                label = { Text(text = "Salario") },
                value = viewModel.salario,
                onValueChange = { viewModel.salario = it})
        }
    }

}

@Composable
@Preview(showSystemUi = true)
fun Preview() {

    OcupacionScreen(onNavigateBack = { /*TODO*/ })

}