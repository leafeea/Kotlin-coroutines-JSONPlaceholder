package com.example.myapplication.model

import com.example.myapplication.network.RetrofitInstance

class UsersViewModel: BaseListViewModel<User>() {
    override suspend fun fetchData(): List<User> {
        return RetrofitInstance.api.getUsers()
    }
}