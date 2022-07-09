package com.alirhn.onlineshop.viewmodels.user

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.users.User
import com.alirhn.onlineshop.models.users.UserVM
import com.alirhn.onlineshop.repository.user.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repository: UserRepository) : ViewModel() {
    fun getUserInfo(onResponse : (response:ServiceResponce<User>)->Unit){
        viewModelScope.launch {
            //TODO : FIX TOKEN
            val response = repository.getUserInfo("")
            onResponse(response)
        }
    }

    fun register(user:UserVM , onResponse : (response:ServiceResponce<User>)->Unit){
        viewModelScope.launch {

            val response = repository.register(user)
            onResponse(response)
        }
    }

    fun login(user: UserVM , onResponse : (response:ServiceResponce<UserVM>)->Unit){
        viewModelScope.launch {
            val response = repository.login(user)
            onResponse(response)
        }
    }

    fun update(user: UserVM , onResponse : (response:ServiceResponce<User>)->Unit){
        viewModelScope.launch {
            val response = repository.update( "", user)
            onResponse(response)
        }
    }

    fun changePassword(user: UserVM , onResponse : (response:ServiceResponce<User>)->Unit){
        viewModelScope.launch {
            val response = repository.changePassword("",user)
            onResponse(response)
        }
    }
}