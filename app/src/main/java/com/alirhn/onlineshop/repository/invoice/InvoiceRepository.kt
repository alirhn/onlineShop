package com.alirhn.onlineshop.repository.invoice

import com.alirhn.onlineshop.api.invoice.InvoiceApi
import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.Invoice
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class InvoiceRepository @Inject constructor(val api: InvoiceApi) {
    suspend fun getInvoiceById(id:Long): ServiceResponce<Invoice> {
        return api.getInvoiceById(id)
    }

    suspend fun getInvoiceByUserId(id: Long , pageIndex : Int , pageSize : Int): ServiceResponce<Invoice> {
        return api.getInvoiceByUserId(id , pageIndex , pageSize)
    }

    suspend fun addInvoice(invoice: Invoice , token:String): ServiceResponce<Invoice> {
        return api.addInvoice(invoice , token)
    }
}