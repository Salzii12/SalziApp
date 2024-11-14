package com.example.frontendtask.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.frontendtask.R

val poppin = FontFamily(
    Font(R.font.poppins_regular1, FontWeight.Normal),
    Font(R.font.poppins_bold1, FontWeight.Bold),
)

@Composable
fun Card(
    imageResourceId: Int,
    title: String,
    developer: String,
    onClick: () -> Unit
) {
    Card(
        modifier = Modifier
            .size(width = 120.dp, height = 150.dp)
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
                .height(80.dp)
                .clip(RoundedCornerShape(15.dp))
        )

        Text(
            text = title,
            fontSize = 11.sp,
            fontWeight = FontWeight.Bold,
            fontFamily = poppin,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp)
        )

        Text(
            text = developer,
            fontSize = 10.sp,
            fontWeight = FontWeight.Normal,
            fontFamily = poppin,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun CardPreview() {
    Card(
        imageResourceId = R.drawable.minecraft,
        title = "Minecraft",
        developer = "Mojang Developer",
        onClick = { }
    )
}
