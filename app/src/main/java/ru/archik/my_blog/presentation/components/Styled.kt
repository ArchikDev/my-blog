package ru.archik.my_blog.presentation.components

import androidx.compose.foundation.layout.Row
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldRow(
  value: String,
  text: String,
  onValueChange: (str: String) -> Unit
) {
  Row {
    OutlinedTextField(
      modifier = Modifier.weight(1f),
      value = value,
      onValueChange = onValueChange,
      label = {
        Text(
          text = text,
          fontSize = 16.sp
        )
      },
      colors = TextFieldDefaults.textFieldColors(
        backgroundColor = Color.White,
        focusedIndicatorColor = Color.Blue,
        unfocusedIndicatorColor = Color.Blue
      ),
      textStyle = TextStyle(
        fontSize = 16.sp,
        color = Color.Black
      ),
      singleLine = true
    )
  }
}