package com.example.frontendtask.ui.theme.tugas

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.frontendtask.R
import com.example.frontendtask.component.TopBarComponents
import androidx.compose.foundation.background
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.ui.graphics.Color
import com.example.frontendtask.component.Card2

@Composable
fun TugasAbout() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF232348))
    ) {
        TopBarComponents(title = "About Me")
        Spacer(modifier = Modifier.height(20.dp))

        LazyColumn(
            modifier = Modifier
                .weight(1f)
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Card2(
                    imageResourceId = R.drawable.salzi_img,
                    title = "Biodata",
                    nama = "Syalzi Astaudi",
                    email = "Syalziastaudi7@gmail.com",
                    universitas = "Politeknik Negeri Batam",
                    jurusan = "Teknik Informatika"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TugasAboutPreview() {
    TugasAbout()
}
