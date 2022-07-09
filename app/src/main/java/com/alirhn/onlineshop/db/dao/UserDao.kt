package com.alirhn.onlineshop.db.dao

import androidx.lifecycle.LiveData
import androidx.room.*
import com.alirhn.onlineshop.db.entities.UserEntity

@Dao
interface UserDao {
    @Insert
   suspend fun addUser(user : UserEntity)

    @Delete
    suspend fun deleteUser(user: UserEntity)

    @Update
   suspend fun updateUser(userEntity: UserEntity)

    @Query("select * from Userentity")
    fun get() : LiveData<UserEntity>

    @Query("delete from UserEntity")
   suspend fun deleteAll()
}