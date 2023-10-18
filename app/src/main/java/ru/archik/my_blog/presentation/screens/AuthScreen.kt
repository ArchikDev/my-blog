package ru.archik.my_blog.presentation.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.archik.my_blog.presentation.components.TextFieldRow

@Composable
fun AuthScreen() {
  val typeAuthRegister = rememberSaveable {
    mutableStateOf(false)
  }

  Scaffold {
    Column(modifier = Modifier
      .fillMaxSize()
      .padding(start = 10.dp, end = 10.dp),
      verticalArrangement = Arrangement.Center
    ) {
      if (!typeAuthRegister.value) SignInFields() else SignUpFields()
      Spacer(modifier = Modifier.height(15.dp))
      Button(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp),
        onClick = { 
          if (typeAuthRegister.value) {
            // TODO
          } else {
            // TODO
          }
        }) {
        Text(text = if (typeAuthRegister.value) "Зарегистрироваться" else "Войти")
      }
      Spacer(modifier = Modifier.height(15.dp))
      Button(modifier = Modifier
        .fillMaxWidth()
        .height(50.dp),
        onClick = {
          typeAuthRegister.value = !typeAuthRegister.value
        }) {
        Text(text = if (typeAuthRegister.value) "Войти" else "Регистация")
      }
    }
  }
}

@Composable
fun SignInFields() {
  val message = rememberSaveable {
    mutableStateOf("")
  }

  val message1 = rememberSaveable {
    mutableStateOf("")
  }

  Text(
    modifier = Modifier
      .fillMaxWidth(),
    text = "Войти",
    fontSize = 20.sp,
    textAlign = TextAlign.Center
  )
  Spacer(modifier = Modifier.height(8.dp))
  TextFieldRow(
    value = message.value,
    text = "Логин",
    onValueChange = {
      message.value = it
    }
  )
  Spacer(modifier = Modifier.height(4.dp))
  TextFieldRow(
    value = message1.value,
    text = "Пароль",
    onValueChange = {
      message1.value = it
    }
  )
}

@Composable
fun SignUpFields() {
  val message = rememberSaveable {
    mutableStateOf("")
  }

  val message1 = rememberSaveable {
    mutableStateOf("")
  }

  val message2 = rememberSaveable {
    mutableStateOf("")
  }

  Text(
    modifier = Modifier
      .fillMaxWidth(),
    text = "Регистрация",
    fontSize = 20.sp,
    textAlign = TextAlign.Center
  )
  Spacer(modifier = Modifier.height(8.dp))
  TextFieldRow(
    value = message.value,
    text = "Логин",
    onValueChange = {
      message.value = it
    }
  )
  Spacer(modifier = Modifier.height(8.dp))
  TextFieldRow(
    value = message1.value,
    text = "Почта",
    onValueChange = {
      message1.value = it
    }
  )
  Spacer(modifier = Modifier.height(4.dp))
  TextFieldRow(
    value = message2.value,
    text = "Пароль",
    onValueChange = {
      message2.value = it
    }
  )
}