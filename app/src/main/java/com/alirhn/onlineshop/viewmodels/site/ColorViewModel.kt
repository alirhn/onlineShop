package com.alirhn.onlineshop.viewmodels.site

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.ProductColor
import com.alirhn.onlineshop.repository.site.ColorRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ColorViewModel @Inject constructor(private val repository: ColorRepository) : ViewModel() {
    fun getAllColors(onResponse : (response  : ServiceResponce<ProductColor>)->Unit){
        viewModelScope.launch {
            val response = repository.getAllColors()
            onResponse(response)
        }
    }

    fun getColorById(id : Long , onResponse : (response:ServiceResponce<ProductColor>)->Unit){
        viewModelScope.launch {
            val response = repository.getColorById(id)
            onResponse(response)
        }
    }
}