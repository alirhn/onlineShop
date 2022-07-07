package com.alirhn.onlineshop.repository.user

import com.alirhn.onlineshop.api.user.UserApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.users.User
import com.alirhn.onlineshop.models.users.UserVM
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class UserRepository @Inject constructor(val api: UserApi) {
    suspend fun getUserInfo(token:String): ServiceResponce<User> {
        return api.getUserInfo(token)
    }

    suspend fun changePassword(token: String , user:UserVM): ServiceResponce<User> {
        return api.changePassword(token , user)
    }

    suspend fun login(user: UserVM): ServiceResponce<UserVM> {
        return api.login(user)
    }

    suspend fun register(user: UserVM): ServiceResponce<User> {
        return api.register(user)
    }

    suspend fun update(token: String , user: UserVM): ServiceResponce<User> {
        return api.update(token , user)
    }
}