package com.alirhn.onlineshop.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.alirhn.onlineshop.db.entities.BasketEntity

@Dao
interface BasketDao {
    @Delete
    suspend fun deleteBasketItem(basketEntity: BasketEntity)

    @Update
    suspend fun updateItem(basketEntity: BasketEntity)

    @Insert
    suspend fun addItem(basketEntity: BasketEntity)

    @Query("delete from basketentity")
    suspend fun deleteAll()

    @Query("select * from basketentity")
    fun getAllBasket(): LiveData<List<BasketEntity>>
}