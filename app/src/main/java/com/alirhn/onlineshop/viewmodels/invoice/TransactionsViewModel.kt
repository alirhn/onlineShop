package com.alirhn.onlineshop.viewmodels.invoice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.PaymentTransaction
import com.alirhn.onlineshop.repository.invoice.TransactionRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TransactionsViewModel @Inject constructor(private val repository: TransactionRepository) :ViewModel(){
    fun gotoPayment(paymentTransaction: PaymentTransaction , onResponse :(response:ServiceResponce<String>)->Unit){
        viewModelScope.launch {
            val response = repository.gotoPayment(paymentTransaction)
            onResponse(response)
        }
    }
}