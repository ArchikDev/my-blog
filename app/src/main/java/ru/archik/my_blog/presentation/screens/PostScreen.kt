package ru.archik.my_blog.presentation.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import ru.archik.my_blog.R

@Composable
fun PostScreen() {
  Scaffold {
    Post()
  }
}

@Composable
private fun Post() {
    Column {
      Image(
        painter = painterResource(id = R.drawable.img_1),
        contentDescription = "image",
        contentScale = ContentScale.Crop,
        modifier = Modifier
          .fillMaxWidth()
          .height(230.dp)
      )
      Box(modifier = Modifier
        .padding(
          top = 15.dp,
          start = 15.dp,
          end = 15.dp,
          bottom = 15.dp
        )) {
        Column {
          Row(
            modifier = Modifier
              .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
          ) {
            Text(
              text = "Заголовок",
              fontSize = 18.sp,
              fontWeight = FontWeight.Bold
            )
            Text(
              text = "11.10.2023:12:15",
              fontSize = 14.sp,
              fontWeight = FontWeight.Medium,
              color = Color.Gray
            )
          }
          Spacer(modifier = Modifier.height(15.dp))
          Text(
            text = "lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem lorem",
            fontSize = 16.sp,
          )
          Spacer(modifier = Modifier.height(15.dp))
          Text(
            text = "Тип новости: Важная",
            fontSize = 16.sp,
            color = Color.Gray
          )
        }
      }
    }
}