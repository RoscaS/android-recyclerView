package com.example.recycleview_app.models

data class BlogPost(
    var id: Int,
    var title: String,
    var body: String,
    var image: String,
    var username: String
) {
  override fun toString(): String {
    return "BlogPost(title='$title', username='$username', id=$id)"
  }
}