package com.alirhn.onlineshop.repository.invoice

import com.alirhn.onlineshop.api.invoice.TransactionsApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.PaymentTransaction
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class TransactionRepository @Inject constructor(val api: TransactionsApi) {
    suspend fun gotoPayment(paymentTransaction: PaymentTransaction): ServiceResponce<String> {
        return api.gotoPayment(paymentTransaction)
    }
}