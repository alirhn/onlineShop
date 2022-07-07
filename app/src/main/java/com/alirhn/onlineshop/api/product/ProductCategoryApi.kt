package com.alirhn.onlineshop.api.ProductCategory

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.ProductCategory
import com.alirhn.onlineshop.models.site.Blog
import retrofit2.http.GET
import retrofit2.http.Path

interface ProductCategoryApi {
    @GET("/api/ProductCategory")
    suspend fun getAllProductCategorys() : ServiceResponce<ProductCategory>

    @GET("/api/ProductCategory/{id}")
    suspend fun getProductCategoryById(@Path("id") id : Long) : ServiceResponce<ProductCategory>
}