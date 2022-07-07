package com.alirhn.onlineshop.models.invoice

import com.alirhn.onlineshop.models.product.Product

data class InvoiceItem(
    var id: Long?,
    var product: Product?,
    var quantity: Int?,
    var unitPrice: Long?,
)
