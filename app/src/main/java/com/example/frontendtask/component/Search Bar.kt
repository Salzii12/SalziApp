package com.example.frontendtask.component

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

@OptIn(ExperimentalMaterial3Api::class) // Suppress the experimental warning
@Composable
fun SearchBar(
    query: String,
    onQueryChange: (String) -> Unit
) {
    var textState by remember { mutableStateOf(TextFieldValue(query)) }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = textState,
            onValueChange = { newValue ->
                textState = newValue
                onQueryChange(newValue.text)
            },
            label = { Text("Search") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedBorderColor = Color(0xFF6200EE),
                unfocusedBorderColor = Color(0xFF6200EE),
                focusedLabelColor = Color(0xFF6200EE),
                unfocusedLabelColor = Color.Gray,
                containerColor = Color.White
            ),
            textStyle = TextStyle(fontFamily = FontFamily.Default, fontWeight = FontWeight.Normal)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    var query by remember { mutableStateOf("Minecraft") }
    SearchBar(query = query, onQueryChange = { query = it })
}
