package com.alirhn.onlineshop.api.site

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Blog
import com.alirhn.onlineshop.models.site.ProductColor
import retrofit2.http.GET
import retrofit2.http.Path

interface ColorApi {
    @GET("/api/color")
    suspend fun getAllColors() : ServiceResponce<ProductColor>

    @GET("/api/color/{id}")
    suspend fun getColorById(@Path("id") id : Long) : ServiceResponce<ProductColor>
}