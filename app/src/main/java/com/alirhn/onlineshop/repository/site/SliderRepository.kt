package com.alirhn.onlineshop.repository.site

import com.alirhn.onlineshop.api.site.SliderApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.site.Slider
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SliderRepository @Inject constructor(val api : SliderApi){
    suspend fun getAllSliders(): ServiceResponce<Slider> {
        return try {
            api.getAllSliders()
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "EXCEPTION")
        }
    }

    suspend fun getSliderById(id : Long) : ServiceResponce<Slider>{
        return try {
            api.getSliderById(id)
        }catch (e:Exception){
            ServiceResponce(message = e.message , status = "EXCEPTION")
        }
    }
}