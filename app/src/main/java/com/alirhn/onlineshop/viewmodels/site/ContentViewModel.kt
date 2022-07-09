package com.alirhn.onlineshop.viewmodels.site

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Content
import com.alirhn.onlineshop.repository.site.ContentRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ContentViewModel @Inject constructor(private val repository : ContentRepository ) : ViewModel() {
    fun getAllContent(onResponse :(response:ServiceResponce<Content>)->Unit){
        viewModelScope.launch {
            val response = repository.getAll()
            onResponse(response)
        }
    }

    fun getContentByTitle(title:String , onResponse : (response:ServiceResponce<Content>)->Unit){
        viewModelScope.launch {
            val response = repository.getContentByTitle(title)
            onResponse(response)
        }
    }
}