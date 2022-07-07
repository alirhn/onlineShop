package com.alirhn.onlineshop.api.user

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.product.ProductCategory
import com.alirhn.onlineshop.models.users.Customer
import com.alirhn.onlineshop.models.users.User
import com.alirhn.onlineshop.models.users.UserVM
import retrofit2.http.*

interface UserApi {
    @GET("/api/user")
    suspend fun getUserInfo(@Header("Authorization") token: String): ServiceResponce<User>


    @PUT("/api/user/changePassword")
    suspend fun changePassword(
        @Header("Authorization") token: String,
        @Body user: UserVM
    ): ServiceResponce<User>


    @POST("/api/user/login")
    suspend fun login(
        @Body user: UserVM
    ): ServiceResponce<UserVM>


    @POST("/api/user/register")
    suspend fun register(
        @Body user: UserVM
    ): ServiceResponce<User>

    @PUT("/api/user/update")
    suspend fun update(
        @Header("Authorization") token: String,
        @Body user: UserVM
    ): ServiceResponce<User>
}