package com.alirhn.onlineshop.models.invoice

import com.alirhn.onlineshop.models.users.User

data class PaymentTransaction(var items : List<InvoiceItem> ,
var user: User)
