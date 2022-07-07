package com.alirhn.onlineshop.models.product

import com.alirhn.onlineshop.models.site.ProductColor

data class Product(
    var id: Long?,
    var addDate: String?,
    var category: ProductCategory?,
    var colors: List<ProductColor>?,
    var description: String?,
    var image: String?,
    var price: Int? ,
    var title:String?,
    var visitCount : Int? ,
    var sizes: List<ProductSIze>?
)
