package com.alirhn.onlineshop.repository.site

import com.alirhn.onlineshop.api.site.BlogApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Blog
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class BlogRepository @Inject constructor(val api : BlogApi) {

    suspend fun getAllBlogs() : ServiceResponce<Blog>{
        return try {
            api.getAllBlogs()
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "exception")
        }
    }

    suspend fun getBlogById(id : Long) : ServiceResponce<Blog>{
        return try {
            api.getBlogById(id)
        }catch (e : Exception){
            ServiceResponce(message = e.message , status = "exception")
        }
    }
}