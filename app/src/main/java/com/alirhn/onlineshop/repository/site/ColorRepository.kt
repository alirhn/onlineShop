package com.alirhn.onlineshop.repository.site

import com.alirhn.onlineshop.api.site.ColorApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.ProductColor
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class ColorRepository  @Inject constructor(val api: ColorApi){
    suspend fun getAllColors(): ServiceResponce<ProductColor> {
        return try {
            api.getAllColors()
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "exception")
        }
    }

    suspend fun getColorById(id : Long) : ServiceResponce<ProductColor>{
        return try {
            api.getColorById(id)
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "exception")
        }
    }
}