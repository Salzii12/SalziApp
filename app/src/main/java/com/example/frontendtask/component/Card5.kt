package com.example.frontendtask.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
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
fun Card5(imageResourceId: Int, title: String, developer: String, description: String, rating: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(600.dp),
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0E9E9)),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = imageResourceId),
                contentDescription = "Card Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .clip(RoundedCornerShape(15.dp))
            )

            Text(
                text = title,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 20.dp)
            )

            Text(
                text = developer,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Gray,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 18.dp, start = 20.dp)
            )

            Text(
                text = description,
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp, start = 20.dp)
            )

            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 20.dp, top = 20.dp)
                    .align(Alignment.End)
            ) {
                Text(
                    text = rating,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppin,
                    color = Color.Black,
                    textAlign = TextAlign.End
                )

                Spacer(modifier = Modifier.width(8.dp))

                Image(
                    painter = painterResource(id = R.drawable.bintang),
                    contentDescription = "Rating Icon",
                    modifier = Modifier
                        .size(20.dp)
                        .padding(bottom = 1.dp)
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Card5Preview() {
    Card5(
        imageResourceId = R.drawable.minecraft,
        title = "Minecraft",
        developer = "Mojang",
        description = "Game ini adalah Game yang seru, menyenangkan dan cocok dimainkan diwaktu santai",
        rating = "4.5"
    )
}
