package com.alirhn.onlineshop.models.invoice

import com.alirhn.onlineshop.models.users.User

class Invoice(
    var id: Long?, var addDate: String?,
    var paymentDate: String?,
    var status: String?,
    var items: List<InvoiceItem>?,
    var transactions: List<Transactions>?,
    var user: User?
)