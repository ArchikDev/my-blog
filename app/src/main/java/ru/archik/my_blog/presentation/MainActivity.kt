package ru.archik.my_blog.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import ru.archik.my_blog.presentation.ui.theme.MyblogTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      MyblogTheme {
        MyBlogApp()
      }
    }
  }
}