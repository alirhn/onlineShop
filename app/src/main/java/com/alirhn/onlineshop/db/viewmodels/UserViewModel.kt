package com.alirhn.onlineshop.db.viewmodels

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.db.entities.UserEntity
import com.alirhn.onlineshop.db.repositories.UserEntityRepository
import kotlinx.coroutines.launch

class UserViewModel(application: Application) : ViewModel() {
    var repository: UserEntityRepository = UserEntityRepository(application)
    var currentUser = repository.getCurrentUser()

    fun deleteUser(userEntity: UserEntity){
        viewModelScope.launch {
            repository.deleteUser(userEntity)
        }
    }

    fun deleteAll(){
        viewModelScope.launch {
            repository.deleteAllUsers()
        }
    }

    fun addUser(userEntity: UserEntity){
        viewModelScope.launch {
            repository.addUser(userEntity)
        }
    }

    fun updateUser(userEntity: UserEntity){
        viewModelScope.launch {
            repository.updateUser(userEntity)
        }
    }
}