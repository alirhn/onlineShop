package com.alirhn.onlineshop.viewmodels.site

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Blog
import com.alirhn.onlineshop.repository.site.BlogRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BlogViewModel @Inject constructor(private val repository: BlogRepository) : ViewModel(){
    fun getAllBlogs(onResponse : (response : ServiceResponce<Blog>) -> Unit){
        viewModelScope.launch {
            val response = repository.getAllBlogs()
            onResponse(response)
        }
    }

    fun getBlogById(id : Long , onResponse : (response : ServiceResponce<Blog>)->Unit){
        viewModelScope.launch {
            val response = repository.getBlogById(id)
            onResponse(response)
        }
    }
}