package com.example.johar.kotlintestforsnail.Retrofit

import com.example.johar.kotlintestforsnail.Models.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface IMyAPI {
    @get:GET("posts")
    val posts:Observable<List<Post>>

}