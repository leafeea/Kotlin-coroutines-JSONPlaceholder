package com.example.myapplication.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import com.example.myapplication.model.PostViewModel
import androidx.lifecycle.viewmodel.compose.viewModel


@Composable
fun PostScreen(viewModel: PostViewModel = viewModel()) {
    val posts = viewModel.posts.value

    val openDialogForPost = remember { mutableStateOf<Int?>(null) }

    LazyColumn(
        modifier = Modifier.fillMaxWidth()
    ) {
        items(posts) { post ->
            PostItem(
                post.userId,
                post.id,
                post.title,
                post.body,
                onClick = { openDialogForPost.value = post.id }
            )
        }
    }

    openDialogForPost.value?.let { postId ->
        val selectedPost = posts.find { it.id == postId }
        selectedPost?.let { post ->
            DialogWindow(
                onDismissRequest = { openDialogForPost.value = null },
                userId = post.userId,
                postId = post.id
            )
        }
    }
}
