package ru.archik.my_blog.data.mapper

import ru.archik.my_blog.data.model.PostDto
import ru.archik.my_blog.domain.entity.Post
import ru.archik.my_blog.utils.HOST

class PostsMapper {

  fun mapResponseToPosts(postDto: List<PostDto>): List<Post> {
    val result = mutableListOf<Post>()

    for (postItem in postDto) {
      val post = Post(
        id = postItem.id,
        title = postItem.title,
        date = postItem.date,
        priority = postItem.priority,
        text = postItem.text,
        img = mapImgToImgUrl(postItem.img)
      )

      result.add(post)
    }

    return result
  }

  private fun mapImgToImgUrl(img: String): String {
    return HOST + img
  }

//  private fun mapTimestampToDate(timestamp: Long): String {
//    val date = Date(timestamp * 1000)
//
//    return SimpleDateFormat("d MMMM yyyy, hh:mm", Locale.getDefault()).format(date)
//  }

}