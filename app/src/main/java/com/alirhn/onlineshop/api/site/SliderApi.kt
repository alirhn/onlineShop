package com.alirhn.onlineshop.api.site

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Slider
import retrofit2.http.GET
import retrofit2.http.Path

interface SliderApi {
    @GET("/api/slider")
    suspend fun getAllSliders(): ServiceResponce<Slider>

    @GET("/api/slider/{id}")
    suspend fun getSliderById(@Path("id") id: Long): ServiceResponce<Slider>

}