package com.alirhn.onlineshop.api.site

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Blog
import com.alirhn.onlineshop.models.site.Content
import retrofit2.http.GET
import retrofit2.http.Path

interface ContentApi {
    @GET("/api/content")
    suspend fun getAllContent() : ServiceResponce<Content>

    @GET("/api/content/{title}")
    suspend fun getContentById(@Path("title") id : String) : ServiceResponce<Content>
}