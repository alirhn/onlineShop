package com.alirhn.onlineshop.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class BasketEntity(
    @PrimaryKey(autoGenerate = true) var id : Int = 0 ,
    var productId : Long ,
    var quantity : Int
)
