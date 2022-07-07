package com.alirhn.onlineshop.api.site

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Blog
import retrofit2.http.GET
import retrofit2.http.Path

interface BlogApi {
    @GET("/api/blog")
    suspend fun getAllBlogs() : ServiceResponce<Blog>

    @GET("/api/blog/{id}")
    suspend fun getBlogById(@Path("id") id : Long) :ServiceResponce<Blog>
}