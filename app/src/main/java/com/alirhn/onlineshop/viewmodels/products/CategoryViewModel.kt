package com.alirhn.onlineshop.viewmodels.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.ProductCategory
import com.alirhn.onlineshop.repository.product.ProductCategoryRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel @Inject constructor(private val repository: ProductCategoryRepository) :
    ViewModel() {
    fun getAllCategory(onResponse: (response: ServiceResponce<ProductCategory>) -> Unit) {
        viewModelScope.launch {
            val response = repository.getAllCategory()
            onResponse(response)
        }
    }

    fun getCategoryById(id : Long , onResponse :(response : ServiceResponce<ProductCategory>)->Unit){
        viewModelScope.launch {
            val response = repository.getCategoryById(id)
            onResponse(response)
        }
    }
}