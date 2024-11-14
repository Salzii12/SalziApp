package com.example.frontendtask.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
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
fun Card4(
    imageResourceId: Int,
    title: String,
    deskripsi: String,
    rating: String,
    onClick: () -> Unit
) {
    androidx.compose.material3.Card(
        modifier = Modifier
            .width(380.dp)
            .height(105.dp)
            .padding(horizontal = 16.dp)
            .clickable { onClick() },
        colors = CardDefaults.cardColors(containerColor = Color(0xFFF0E9E9)),
        shape = RoundedCornerShape(15.dp),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxSize()
        ) {
            Box(
                modifier = Modifier
                    .width(140.dp)
                    .fillMaxHeight()
                    .clip(RoundedCornerShape(topStart = 15.dp, bottomStart = 15.dp))
            ) {
                Image(
                    painter = painterResource(id = imageResourceId),
                    contentDescription = "Card Image",
                    modifier = Modifier
                        .fillMaxSize()
                        .clip(RoundedCornerShape(topStart = 15.dp, bottomStart = 15.dp))
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = title,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    fontFamily = poppin,
                    color = Color.Black,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp, start = 14.dp)
                )

                Text(
                    text = deskripsi,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Normal,
                    fontFamily = poppin,
                    color = Color.Gray,
                    textAlign = TextAlign.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 8.dp, start = 14.dp)
                )

                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 14.dp, bottom = 5.dp)
                ) {
                    Text(
                        text = rating,
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = poppin,
                        color = Color.Black,
                        textAlign = TextAlign.End
                    )

                    Spacer(modifier = Modifier.width(4.dp))

                    Image(
                        painter = painterResource(id = R.drawable.bintang),
                        contentDescription = "Rating Icon",
                        modifier = Modifier
                            .size(12.dp)
                            .padding(bottom = 1.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Card4Preview() {
    Card4(
        imageResourceId = R.drawable.minecraft,
        title = "Minecraft",
        deskripsi = "Game ini adalah yang seru, menyenangkan dan cocok dimainkan diwaktu santai",
        rating = "4.9",
        onClick = { }
    )
}