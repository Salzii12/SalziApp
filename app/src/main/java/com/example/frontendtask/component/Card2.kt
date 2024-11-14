package com.example.frontendtask.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontendtask.R

@Composable
fun Card2(imageResourceId: Int, title: String, nama: String, email: String, universitas: String, jurusan: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(800.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0E9E9)),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageResourceId),
            contentDescription = "Card Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(360.dp)
                .clip(RoundedCornerShape(15.dp))
        )

        Text(
            text = title,
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppin,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 30.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Nama",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 15.dp)
            )

            Text(
                text = ":",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 43.dp, end = 8.dp)
            )

            Text(
                text = nama,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Email",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 15.dp)
            )

            Text(
                text = ":",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 49.dp, end = 8.dp)
            )

            Text(
                text = email,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Universitas",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 15.dp)
            )

            Text(
                text = ":",
                fontSize = 15.sp,
                modifier = Modifier.padding(horizontal = 8.dp)
            )

            Text(
                text = universitas,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = "Jurusan",
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 15.dp, end = 8.dp)
            )

            Text(
                text = ":",
                fontSize = 15.sp,
                modifier = Modifier.padding(start = 21.dp, end = 8.dp)
            )

            Text(
                text = jurusan,
                fontSize = 15.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Card2Preview() {
    Card2(
        imageResourceId = R.drawable.salzi_img,
        title = "Biodata",
        nama = "Syalzi Astaudi",
        email = "syalziastaudi7@gmail.com",
        universitas = "Politeknik Negeri Batam",
        jurusan = "Teknik Informatika"
    )
}