package com.example.frontendtask.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
fun Card3(
    imageResourceId: Int,
    title: String,
    developer: String,
    rating: String,
    onClick: () -> Unit
) {
    androidx.compose.material3.Card(
        modifier = Modifier
            .size(width = 200.dp, height = 200.dp)
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0E9E9)),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Image(
            painter = painterResource(id = imageResourceId),
            contentDescription = "Card Image",
            modifier = Modifier
                .fillMaxWidth()
                .height(148.dp)
                .clip(RoundedCornerShape(15.dp))
        )

        Text(
            text = title,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppin,
            color = Color.Black,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp, start = 12.dp)
        )

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp),
        ) {
            Text(
                text = developer,
                fontSize = 10.sp,
                fontWeight = FontWeight.Normal,
                fontFamily = poppin,
                color = Color.Black,
                textAlign = TextAlign.Start,
                modifier = Modifier.padding(start = 12.dp)
            )

            Spacer(modifier = Modifier.width(10.dp))

            Row(
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(end = 12.dp)
            ) {
                Text(
                    text = rating,
                    fontSize = 9.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppin,
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                    modifier = Modifier.padding(top = 2.dp)
                )

                Spacer(modifier = Modifier.width(3.dp))

                Image(
                    painter = painterResource(id = R.drawable.bintang),
                    contentDescription = "Rating Icon",
                    modifier = Modifier
                        .size(10.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Card3Preview() {
    Card3(
        imageResourceId = R.drawable.minecraft,
        title = "Minecraft",
        developer = "Mojang Developer",
        rating = "4.9",
        onClick = { }
    )
}
