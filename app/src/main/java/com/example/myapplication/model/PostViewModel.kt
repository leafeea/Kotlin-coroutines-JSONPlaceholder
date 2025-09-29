package com.example.myapplication.model

import com.example.myapplication.network.RetrofitInstance

class PostViewModel: BaseListViewModel<Post>() {
    override suspend fun fetchData(): List<Post> {
        return RetrofitInstance.api.getPosts()
    }
}