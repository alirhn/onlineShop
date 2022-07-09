package com.alirhn.onlineshop.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class UserEntity(
    @PrimaryKey(autoGenerate = true )var id: Int = 0,
    var userName: String?,
    var customerId: Long?,
    var token : String?,
    var address:String?,
    var lastName:String?,
    var firstName:String?,
    var phone:String?,
    var postalCode:String?,
    var userId:Long
)
