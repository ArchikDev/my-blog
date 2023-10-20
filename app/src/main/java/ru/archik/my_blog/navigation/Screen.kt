package ru.archik.my_blog.navigation

sealed class Screen(
  val route: String
) {

  object Auth: Screen(ROUTE_AUTH)
  object Posts: Screen(ROUTE_POSTS)
  object Post: Screen(ROUTE_POST)

  companion object {
    const val ROUTE_AUTH = "auth"
    const val ROUTE_POSTS = "posts"
    const val ROUTE_POST = "post"
  }

}