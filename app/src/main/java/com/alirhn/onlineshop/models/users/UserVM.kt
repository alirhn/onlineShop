package com.alirhn.onlineshop.models.users

data class UserVM(
    var id: Long?,
    var password: String?,
    var oldPassword: String?,
    var userName: String?,
    var customerId: Long?,
    var token : String?,
    var repeatPassword : String?,
    var address:String?,
    var lastName:String?,
    var firstName:String?,
    var phone:String?,
    var postalCode:String?

)
