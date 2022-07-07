package com.alirhn.onlineshop.api.invoice

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.PaymentTransaction
import retrofit2.http.Body
import retrofit2.http.POST

interface TransactionsApi {
    @POST("api/trx/gotoPayment")
    suspend fun gotoPayment(@Body data:PaymentTransaction) : ServiceResponce<String>
}