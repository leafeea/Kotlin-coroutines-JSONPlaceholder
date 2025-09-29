package com.example.myapplication.network

import com.example.myapplication.model.Post
import com.example.myapplication.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("posts?_limit=10")
    suspend fun getPosts(): List<Post>

    @GET("users")
    suspend fun getUsers(): List<User>
}