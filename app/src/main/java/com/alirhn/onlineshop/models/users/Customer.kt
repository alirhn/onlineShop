package com.alirhn.onlineshop.models.users

data class Customer(
    var id : Long? ,
    var address:String?,
    var lastName:String?,
    var firstName:String?,
    var phone:String?,
    var postalCode:String?
)
