package ru.archik.my_blog.presentation.screens.postsScreen

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import kotlinx.coroutines.flow.filter
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onStart
import ru.archik.my_blog.data.repository.PostRepositoryImpl

class PostsScreenViewModel(application: Application): AndroidViewModel(application)  {

  private val repository = PostRepositoryImpl(application)

  private val loadedList = repository.loadedListPostsFlow()

  val screenState = loadedList
    .filter { it.isNotEmpty() }
    .map { PostScreenState.Posts(posts = it) as PostScreenState }
    .onStart { emit(PostScreenState.Loading) }

}