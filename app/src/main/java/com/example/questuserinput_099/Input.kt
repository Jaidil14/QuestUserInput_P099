package com.example.questuserinput_099

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Input(modifier: Modifier) {
    var textNama by remember { mutableStateOf("" ) }
    var textJK by remember { mutableStateOf("" ) }
    var textStatus by remember { mutableStateOf("" ) }
    var textAlamat by remember { mutableStateOf("" ) }

    var nama by remember { mutableStateOf("" ) }
    var jenis by remember { mutableStateOf("" ) }
    var statusPerkawinan by remember { mutableStateOf("" ) }
    var alamat by remember { mutableStateOf("" ) }

    val gender:List<String> = listOf("Laki-laki", "Perempuan")
    val status:List<String> = listOf("Janda","Lajang","Duda")

    val lightPurple = Color(0xFFb38fd5)
    val darkPurple = Color(0xFF6750A4)
    val backgroundColor = Color(0xFFF7F2FA)

    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(top = 50.dp)
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .background(lightPurple)
                .height(100.dp)
                .padding(15.dp)
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))



    }
}