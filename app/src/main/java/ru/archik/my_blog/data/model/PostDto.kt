package ru.archik.my_blog.data.model

import com.google.gson.annotations.SerializedName

data class PostDto(
  @SerializedName("id") val id: Long,
  @SerializedName("title") val title: String,
  @SerializedName("publishedAt") val date: String,
  @SerializedName("priority") val priority: String,
  @SerializedName("text") val text: String,
  @SerializedName("img_post") val img: String,
)


//"id": 1,
//"title": "Лобстеры вперед",
//"publishedAt": "2023-10-13T16:58:13.833Z",
//"priority": "regular",
//"text": "_Лобстер_, хорошо известный во всем мире морской рак, имеет и еще одно **название** – омар. Лобстер считается морским деликатесом. Самыми ценными и вкусными считаются атлантические (норвежские) омары, хотя они и не самые крупные, до 22 см в длину.",
//"img_post": "/uploads/lob_6982d39597.jpg"
