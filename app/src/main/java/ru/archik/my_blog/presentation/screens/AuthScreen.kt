package ru.archik.my_blog.presentation.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.archik.my_blog.presentation.components.TextFieldRow

@Composable
fun AuthScreen() {
  val message = rememberSaveable {
    mutableStateOf("")
  }
  val message1 = rememberSaveable {
    mutableStateOf("")
  }

  Scaffold {
    Column(modifier = Modifier
      .padding(start = 10.dp, end = 10.dp)
    ) {
      TextFieldRow(
        value = message.value,
        text = "Логин",
        onValueChange = {
          message.value = it
        }
      )
      TextFieldRow(
        value = message1.value,
        text = "Пароль",
        onValueChange = {
          message1.value = it
        }
      )
    }
  }
}