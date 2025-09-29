package com.example.myapplication.model

data class User(
    val id: Int,
    var name: String,
    var username: String,
    var email: String,
    val address: Address
)

data class Address(
    var street: String,
    var city: String,
)