package com.alirhn.onlineshop.viewmodels.site

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Slider
import com.alirhn.onlineshop.repository.site.SliderRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SliderViewModels @Inject constructor(
    private val repository: SliderRepository
) : ViewModel() {

    fun getAllSliders(onResponse: (response: ServiceResponce<Slider>) -> Unit) {
        viewModelScope.launch {
            val response = repository.getAllSliders()
            onResponse(response)
        }
    }

    fun getSliderById(id: Long, onResponse: (response: ServiceResponce<Slider>) -> Unit) {
        viewModelScope.launch {
            val response = repository.getSliderById(id)
            onResponse(response)
        }
    }
}