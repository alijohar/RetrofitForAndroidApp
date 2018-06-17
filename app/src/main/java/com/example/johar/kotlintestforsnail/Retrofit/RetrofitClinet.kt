package com.example.johar.kotlintestforsnail.Retrofit

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory

object RetrofitClinet {
    private var ourInstance:Retrofit? = null

    val instance:Retrofit
        get() {
            if (ourInstance == null){
                ourInstance = Retrofit.Builder().baseUrl("https://jsonplaceholder.typicode.com/posts").addCallAdapterFactory(RxJava2CallAdapterFactory.create()).build()

            }
            return ourInstance!!
        }
}