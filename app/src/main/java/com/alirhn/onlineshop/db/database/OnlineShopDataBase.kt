package com.alirhn.onlineshop.db.database

import android.app.Application
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.alirhn.onlineshop.db.dao.BasketDao
import com.alirhn.onlineshop.db.dao.UserDao
import com.alirhn.onlineshop.db.entities.BasketEntity
import com.alirhn.onlineshop.db.entities.UserEntity

@Database(entities = [BasketEntity::class, UserEntity::class], version = 1)
abstract class OnlineShopDataBase : RoomDatabase() {
    abstract fun basketDao() : BasketDao
    abstract fun userDao() : UserDao

    companion object{
        var instance : OnlineShopDataBase ?= null

        fun getInstance(application: Application) : RoomDatabase{
            if (instance == null){
                instance = Room.databaseBuilder(application ,
                OnlineShopDataBase::class.java , "onlineshop.db").fallbackToDestructiveMigration().build()
            }
            return instance as RoomDatabase
        }
    }
}