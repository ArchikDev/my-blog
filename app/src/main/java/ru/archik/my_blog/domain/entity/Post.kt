package ru.archik.my_blog.domain.entity

data class Post(
  val id: Long,
  val title: String,
  val date: String,
  val priority: String,
  val text: String,
  val img: String?,
)
