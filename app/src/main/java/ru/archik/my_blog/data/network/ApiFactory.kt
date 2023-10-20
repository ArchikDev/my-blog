package ru.archik.my_blog.data.network

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object ApiFactory {
  // Логирование
  private val okHttpClient = OkHttpClient.Builder()
    .addInterceptor(HttpLoggingInterceptor().apply {
      level = HttpLoggingInterceptor.Level.BODY
    })
    .build()

  private val retrofit = Retrofit.Builder()
    .baseUrl("http://localhost:1337/api/")
    .addConverterFactory(GsonConverterFactory.create())
    .client(okHttpClient)
    .build()

  val apiService: ApiService = retrofit.create()

}