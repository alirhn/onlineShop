package com.alirhn.onlineshop.repository.site

import com.alirhn.onlineshop.api.site.ContentApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Content
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ContentRepository @Inject constructor(val api: ContentApi){
    suspend fun getAll() : ServiceResponce<Content>{
        return try {
            api.getAllContent()
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "exception")
        }
    }

    suspend fun getContentByTitle(title : String) : ServiceResponce<Content>{
        return try {
        api.getContentById(title)
    }catch (e:Exception){
        ServiceResponce(message = e.message , status = "exception")
    }
    }
}