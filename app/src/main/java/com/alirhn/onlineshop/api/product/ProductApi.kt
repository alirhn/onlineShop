package com.alirhn.onlineshop.api.product

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.Product
import com.alirhn.onlineshop.models.product.ProductCategory
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductApi {
    @GET("/api/product")
    suspend fun getAllProduct() : ServiceResponce<Product>

    @GET("/api/product/{id}")
    suspend fun getProductById(@Path("id") id : Long) : ServiceResponce<Product>

    @GET("/api/product/new")
    suspend fun getNewProduct() : ServiceResponce<Product>

    @GET("/api/product/popular")
    suspend fun getPopularProduct() : ServiceResponce<Product>
}