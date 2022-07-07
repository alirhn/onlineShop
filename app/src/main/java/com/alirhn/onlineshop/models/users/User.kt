package com.alirhn.onlineshop.models.users

data class User(
    var id: Long?,
    var password: String?,
    var userName: String?,
    var customer: Customer?
)
