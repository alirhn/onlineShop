package com.alirhn.onlineshop.models.invoice

data class Transactions(
    var amount: Int?,
    var code: Int?,
    var id: Long?,
    var cardHolder: String?,
    var custom: String?,
    var customerPhone: String?,
    var orderId: String?,
    var refId: String?,
    var refundRequest: String?,
    var shaparakRefId: String?,
    var transId: String?
)
