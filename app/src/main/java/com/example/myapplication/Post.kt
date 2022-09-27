package com.example.myapplication

data class Post(
    val id:Int,
    var likeCount:Int,
    val postImageId:Int,
    val authorImage:Int,
    val authorName:String,
    val description:String
)
