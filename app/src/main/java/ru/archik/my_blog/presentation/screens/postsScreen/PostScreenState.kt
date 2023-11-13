package ru.archik.my_blog.presentation.screens.postsScreen

import ru.archik.my_blog.domain.entity.Post

sealed class PostScreenState {
  object Initial: PostScreenState()
  object Loading: PostScreenState()

  data class Posts(
    val posts: List<Post>
  ): PostScreenState()
}
