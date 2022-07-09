package com.alirhn.onlineshop.db.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.db.entities.BasketEntity
import com.alirhn.onlineshop.db.repositories.BasketRepository
import kotlinx.coroutines.launch

class BasketViewModel(application: Application) : ViewModel() {
    var repository = BasketRepository(application)
    var allBasketItems = repository.getAllItems()

    fun addItem(basketEntity: BasketEntity){
        viewModelScope.launch {
            repository.addItem(basketEntity)
        }
    }

    fun deleteItem(basketEntity: BasketEntity){
        viewModelScope.launch {
            repository.deleteItem(basketEntity)
        }
    }

    fun update(basketEntity: BasketEntity){
        viewModelScope.launch {
            repository.update(basketEntity)
        }
    }

    fun deleteAll(){
        viewModelScope.launch {
            repository.deleteAll()
        }
    }
}