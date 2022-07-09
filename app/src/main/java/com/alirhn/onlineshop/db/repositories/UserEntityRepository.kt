package com.alirhn.onlineshop.db.repositories

import android.app.Application
import androidx.lifecycle.LiveData
import com.alirhn.onlineshop.db.database.OnlineShopDataBase
import com.alirhn.onlineshop.db.entities.UserEntity

class UserEntityRepository (application: Application){
    private  var dataBase: OnlineShopDataBase = OnlineShopDataBase.getInstance(application) as OnlineShopDataBase
    private lateinit var currentUser :LiveData< UserEntity>
    val dao = dataBase.userDao()

    fun getCurrentUser() : LiveData<UserEntity>{
        currentUser = dao.get()
        return currentUser
    }

    suspend fun deleteUser(userEntity: UserEntity){
        dao.deleteUser(userEntity)
    }

    suspend fun updateUser(userEntity: UserEntity){
        dao.updateUser(userEntity)
    }

    suspend fun deleteAllUsers(){
        dao.deleteAll()
    }
    suspend fun addUser(userEntity: UserEntity){
        dao.addUser(userEntity)
    }

}