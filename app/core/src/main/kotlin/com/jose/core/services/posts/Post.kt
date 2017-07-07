package com.jose.core.services.posts

data class Post(
    val userId : Int,
    val id : Int,
    val title: String,
    val body : String
)