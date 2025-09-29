package com.example.myapplication.model

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseListViewModel<T: Any>: ViewModel() {
    var items = mutableStateOf<List<T>>(emptyList())

    protected abstract suspend fun fetchData(): List<T>

    init {
        fetchItems()
    }

    private fun fetchItems(){
        viewModelScope.launch {
            try {
                items.value = fetchData()
            }catch (e: Exception){
                e.printStackTrace()
            }
        }
    }
}