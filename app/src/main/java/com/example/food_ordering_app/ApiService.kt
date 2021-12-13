package com.example.food_ordering_app

import androidx.recyclerview.widget.RecyclerView
import retrofit2.http.Body
import retrofit2.http.POST
import java.net.CacheRequest

interface ApiService {
    @POST("/register")
    suspend fun Register(@Body request: RegisterUser)

    @POST("/login")
    suspend fun Login(@Body request: RegisterUser):LoginResponses
}