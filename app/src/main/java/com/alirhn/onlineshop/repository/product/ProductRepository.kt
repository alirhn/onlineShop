package com.alirhn.onlineshop.repository.product

import com.alirhn.onlineshop.api.product.ProductApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.Product
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ProductRepository @Inject constructor(val api: ProductApi){

    suspend fun getAllProducts() : ServiceResponce<Product>{
        return api.getAllProduct()
    }

    suspend fun getProductById(id:Long) :ServiceResponce<Product>{
        return api.getProductById(id)
    }

    suspend fun getProductNew(): ServiceResponce<Product> {
        return api.getNewProduct()
    }

    suspend fun getPopularProduct() : ServiceResponce<Product>{
        return api.getPopularProduct()
    }
}