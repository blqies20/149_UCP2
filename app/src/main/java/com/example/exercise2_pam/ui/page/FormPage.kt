package com.example.exercise2_pam.ui.page

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.exercise2_pam.FormViewModel
import com.example.exercise2_pam.R
import com.example.exercise2_pam.data.FormUIState
import com.example.exercise2_pam.ui.theme.Exercise2_PAMTheme
import java.util.zip.DataFormatException

@Composable
fun TampilLayout(){
    Card(
        modifier = Modifier,
        elevation = CardDefaults.cardElevation(defaultElevation = 10.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(10.dp)
        ) {
            Text(
                stringResource(id = R.string.navname),
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp,
            )
            DataForm()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DataForm(

){
    var namaTxt by remember{ mutableStateOf("") }
    var nimTxt by remember { mutableStateOf("") }
    var konsenTxt by remember { mutableStateOf("") }
    var judulTxt by remember { mutableStateOf("") }

    var listData: MutableList<String> = mutableListOf(namaTxt,nimTxt,konsenTxt, judulTxt)

    OutlinedTextField(
        value = namaTxt,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(stringResource(id = R.string.nama))},
        onValueChange = {
            namaTxt = it
        }
    )

    OutlinedTextField(
        value = nimTxt,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(stringResource(id = R.string.nim))},
        onValueChange = {
            nimTxt = it
        }
    )

    OutlinedTextField(
        value = konsenTxt,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(stringResource(id = R.string.konsen))},
        onValueChange = {
            konsenTxt = it
        }
    )

    OutlinedTextField(
        value = judulTxt,
        singleLine = true,
        shape = MaterialTheme.shapes.large,
        modifier = Modifier.fillMaxWidth(),
        label = { Text(stringResource(id = R.string.judul))},
        onValueChange = {
            judulTxt = it
        }
    )
}

@Composable
fun SelectDosen(
    option: List<String>,
    onSelectionChanged: (String) -> Unit = {}
){
    
}

@Preview(showBackground = true)
@Composable
fun FormPreview(){
    Exercise2_PAMTheme {
        TampilLayout()
    }
}