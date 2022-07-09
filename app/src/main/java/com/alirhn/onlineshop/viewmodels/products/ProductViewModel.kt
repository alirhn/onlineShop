package com.alirhn.onlineshop.viewmodels.products

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.Product
import com.alirhn.onlineshop.repository.product.ProductRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel  @Inject constructor(private val repository: ProductRepository) : ViewModel(){
    fun getAllProducts(onResponse : (response:ServiceResponce<Product>)->Unit){
        viewModelScope.launch {
            val response = repository.getAllProducts()
            onResponse(response)
        }
    }

    fun getNewProducts(onResponse : (response:ServiceResponce<Product>)->Unit){
        viewModelScope.launch {
            val response = repository.getProductNew()
            onResponse(response)
        }
    }

    fun getPopularProducts(onResponse : (response:ServiceResponce<Product>)->Unit){
        viewModelScope.launch {
            val response = repository.getPopularProduct()
            onResponse(response)
        }
    }

    fun getProductByID( id : Long , onResponse : (response:ServiceResponce<Product>)->Unit){
        viewModelScope.launch {
            val response = repository.getProductById(id)
            onResponse(response)
        }
    }
}