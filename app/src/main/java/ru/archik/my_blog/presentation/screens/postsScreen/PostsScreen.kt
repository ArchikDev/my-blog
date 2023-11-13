package ru.archik.my_blog.presentation.screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import ru.archik.my_blog.R
import ru.archik.my_blog.domain.entity.Post
import ru.archik.my_blog.presentation.screens.postsScreen.PostScreenState
import ru.archik.my_blog.presentation.screens.postsScreen.PostsScreenViewModel

@Composable
fun PostsScreen() {

  val viewModel: PostsScreenViewModel = viewModel()
  val screenState = viewModel.screenState.collectAsState(PostScreenState.Initial)

  when (val currentState = screenState.value) {
    is PostScreenState.Posts -> {
      LazyColumn(
        contentPadding = PaddingValues(
          top = 16.dp,
          start = 8.dp,
          end = 8.dp,
          bottom = 16.dp
        ),
        verticalArrangement = Arrangement.spacedBy(8.dp)
      ) {
        items(
          items = currentState.posts,
          key = { it.id }
        ) { item ->
          Post(item)
        }
      }
    }
    is PostScreenState.Loading -> {
      Box(modifier = Modifier
        .fillMaxSize(),
        contentAlignment = Alignment.Center
      ) {
        CircularProgressIndicator(color = Color.Blue)
      }
    }
    is PostScreenState.Initial -> {}
    else -> {}
  }



//  Scaffold {
//    LazyColumn(modifier = Modifier.padding(start = 15.dp, end = 15.dp)) {
//      items(5) {
//        Post()
//      }
////      items(MockData.RestauranList) { RestauranData ->
////        itemRestaurants(restauranData = RestauranData, onRestauranClick = {
////          navController.navigate("${Constants.Screens.RESTAURAN_DETAIL_LIST_SCREEN}/${RestauranData.id}")
//////          navController.navigate(NavRoute.MyOrder.route)
////        })
////      }
//    }
//  }
}

@Composable
private fun Post(item: Post) {
  Card(modifier = Modifier
    .fillMaxWidth()
    .padding(top = 7.dp, bottom = 15.dp, start = 15.dp, end = 15.dp)
    .clickable {
      // TODO
    },
    elevation = 10.dp
  ) {
    Column {
      AsyncImage(
        model = item.img,
        modifier = Modifier
          .fillMaxWidth()
          .height(230.dp),
        contentDescription = null,
        contentScale = ContentScale.FillWidth
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
              text = item.title,
              fontSize = 18.sp,
              fontWeight = FontWeight.Bold
            )
            Text(
              text = item.date,
              fontSize = 14.sp,
              fontWeight = FontWeight.Medium,
              color = Color.Gray
            )
          }
          Spacer(modifier = Modifier.height(15.dp))
          Text(
            text = item.text,
            fontSize = 16.sp,
          )
          Spacer(modifier = Modifier.height(15.dp))
          Text(
            text = "Тип новости: ${item.priority}",
            fontSize = 16.sp,
            color = Color.Gray
          )
        }
      }
    }
  }
}