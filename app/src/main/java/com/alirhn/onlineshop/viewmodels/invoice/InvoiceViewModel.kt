package com.alirhn.onlineshop.viewmodels.invoice

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.Invoice
import com.alirhn.onlineshop.repository.invoice.InvoiceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class InvoiceViewModel @Inject constructor(private val repository: InvoiceRepository) : ViewModel(){
    fun getInVoiceById(id : Long , onResponse:(response:ServiceResponce<Invoice>)->Unit){
        viewModelScope.launch {
            val response = repository.getInvoiceById(id)
            onResponse(response)
        }
    }

    fun getInVoiceByUSerId(id : Long ,pageIndex : Int , pageSize : Int , onResponse:(response:ServiceResponce<Invoice>)->Unit){
        viewModelScope.launch {
            val response = repository.getInvoiceByUserId(id , pageIndex , pageSize)
            onResponse(response)
        }
    }

    fun addInvoice(invoice: Invoice , onResponse:(response:ServiceResponce<Invoice>)->Unit){
        viewModelScope.launch {
            val response = repository.addInvoice(invoice , "")
            onResponse(response)
        }
    }


}