package com.example.questuserinput_099

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Input(modifier: Modifier) {
    var textNama by remember { mutableStateOf("" ) }
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
            .padding(top = 25.dp)
    ) {
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .background(lightPurple)
                .height(100.dp)
                .padding(15.dp, top = 55.dp)
        ) {
            Text(
                text = "Formulir Pendaftaran",
                fontSize = 30.sp,
                color = Color.White
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 15.dp),
            shape = RoundedCornerShape(25.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 5.dp),
            colors = CardDefaults.cardColors(containerColor = Color.White)
        ) {
            Column(
                modifier = Modifier.padding(20.dp)
            ) {
                Text(
                    text = "NAMA LENGKAP",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                OutlinedTextField(
                    value = textNama,
                    label = {Text ("Isian nama lengkap")},
                    modifier = Modifier.fillMaxWidth(),
                    shape = RoundedCornerShape(8.dp),
                    onValueChange = {textNama = it}
                )

                Spacer(modifier = Modifier.height(15.dp))

                Text(
                    text = "JENIS KELAMIN",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                Column {
                    gender.forEach { option ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            RadioButton(
                                selected = (jenis == option),
                                onClick = { jenis = option },
                                colors = RadioButtonDefaults.colors(selectedColor = darkPurple)
                            )
                            Text(
                                text = option,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "STATUS PERKAWINAN",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray
                )
                Column {
                    status.forEach { option ->
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 4.dp)
                        ) {
                            RadioButton(
                                selected = (statusPerkawinan == option),
                                onClick = { statusPerkawinan = option },
                                colors = RadioButtonDefaults.colors(selectedColor = darkPurple)
                            )
                            Text(
                                text = option,
                                modifier = Modifier.padding(start = 8.dp)
                            )
                        }
                    }
                }

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "ALAMAT",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Gray,
                    modifier = Modifier.padding(bottom = 4.dp)
                )
                OutlinedTextField(
                    value = textAlamat,
                    onValueChange = { textAlamat = it },
                    label = { Text("Alamat") },
                    modifier = Modifier.fillMaxWidth()
                )

                Spacer(modifier = Modifier.height(20.dp))

                Button(
                    onClick = {

                    },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(30.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = darkPurple)
                ) {
                    Text(
                        stringResource(R.string.submit),
                        color = Color.White,
                        fontSize = 18.sp
                    )
                }

                Spacer(modifier = Modifier.height(10.dp))
            }
        }

    }
}