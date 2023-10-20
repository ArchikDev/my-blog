package ru.archik.my_blog.presentation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ru.archik.my_blog.navigation.AppNavGraph
import ru.archik.my_blog.navigation.rememberNavigationState
import ru.archik.my_blog.presentation.screens.AuthScreen
import ru.archik.my_blog.presentation.screens.PostScreen
import ru.archik.my_blog.presentation.screens.PostsScreen

@Composable
fun MyBlogApp() {
  val navigationState = rememberNavigationState()

  Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
    Scaffold {
      AppNavGraph(
        navHostController = navigationState.navHostController,
        authScreenContent = { AuthScreen(navigationState) },
        postsScreenContent = { PostsScreen() },
        postScreenContent = { PostScreen() }
      )
    }

  }
}