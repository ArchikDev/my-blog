package ru.archik.my_blog.data.repository

import android.app.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.stateIn
import ru.archik.my_blog.data.mapper.PostsMapper
import ru.archik.my_blog.data.network.ApiFactory.apiService
import ru.archik.my_blog.domain.entity.Post

class PostRepositoryImpl(application: Application) {

  private val coroutineScope = CoroutineScope(Dispatchers.Default)
  private val mapper = PostsMapper()


  fun loadedListPostsFlow(): StateFlow<List<Post>> = flow {
    val posts = apiService.getPosts()

    delay(3000)

    emit(mapper.mapResponseToPosts(posts))
  }.stateIn(
    scope = coroutineScope,
    started = SharingStarted.Lazily,
    initialValue = listOf()
  )


}