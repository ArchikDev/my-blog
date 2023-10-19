package ru.archik.my_blog.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.archik.my_blog.presentation.screens.AuthScreen
import ru.archik.my_blog.presentation.screens.PostScreen
import ru.archik.my_blog.presentation.screens.PostsScreen

@Composable
fun MyBlogApp() {
  Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
//    AuthScreen()
    PostScreen()
  }
}