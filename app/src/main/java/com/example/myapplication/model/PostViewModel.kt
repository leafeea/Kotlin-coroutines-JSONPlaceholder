package com.example.myapplication.model

import androidx.lifecycle.viewModelScope
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.myapplication.network.RetrofitInstance
import kotlinx.coroutines.launch

class PostViewModel: ViewModel() {
    var posts = mutableStateOf<List<Post>>(emptyList())

    init {
        fetchPosts()
    }

    private fun fetchPosts(){
        viewModelScope.launch {
            try {
                posts.value = RetrofitInstance.api.getPosts()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}