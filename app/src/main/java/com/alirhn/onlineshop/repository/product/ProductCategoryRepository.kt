package com.alirhn.onlineshop.repository.product

import com.alirhn.onlineshop.api.ProductCategory.ProductCategoryApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.ProductCategory
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ProductCategoryRepository  @Inject constructor(val api: ProductCategoryApi){

    suspend fun getAllCategory(): ServiceResponce<ProductCategory> {
        return api.getAllProductCategorys()
    }

    suspend fun getCategoryById(id : Long): ServiceResponce<ProductCategory> {
        return api.getProductCategoryById(id)
    }
}