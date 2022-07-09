package com.alirhn.onlineshop.db.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import com.alirhn.onlineshop.db.database.OnlineShopDataBase
import com.alirhn.onlineshop.db.entities.BasketEntity

class BasketRepository (application: Application){
    var db : OnlineShopDataBase = OnlineShopDataBase.getInstance(application) as OnlineShopDataBase
    var dao = db.basketDao()
    private lateinit var allBasketItems : LiveData<List<BasketEntity>>

    fun getAllItems() : LiveData<List<BasketEntity>>{
        allBasketItems = dao.getAllBasket()
        return allBasketItems
    }

    suspend fun addItem(basketEntity: BasketEntity){
        dao.addItem(basketEntity)
    }

    suspend fun deleteItem(basketEntity: BasketEntity){
        dao.deleteBasketItem(basketEntity)
    }

    suspend fun deleteAll(){
        dao.deleteAll()
    }

    suspend fun update(basketEntity: BasketEntity){
        dao.updateItem(basketEntity)
    }
}