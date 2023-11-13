package ru.archik.my_blog.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun AppNavGraph(
  navHostController: NavHostController,
  authScreenContent: @Composable () -> Unit,
  postScreenContent: @Composable () -> Unit,
  postsScreenContent: @Composable () -> Unit,
) {
  NavHost(
    navController = navHostController,
    startDestination = Screen.Auth.route
  ) {
    composable(Screen.Auth.route) {
      authScreenContent()
    }
    composable(Screen.Posts.route) {
      postsScreenContent()
    }
    composable(Screen.Post.route) {
      postScreenContent()
    }
  }
}