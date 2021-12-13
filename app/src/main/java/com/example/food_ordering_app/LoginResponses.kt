package com.example.food_ordering_app

data class LoginResponses( var id:Int,
    var token: String,
    var email:String,
    var memberSince: Int,
    var password:String? )
