package com.alirhn.onlineshop.api.invoice

import com.alirhn.onlineshop.models.ServiceResponce
import com.alirhn.onlineshop.models.invoice.Invoice
import com.alirhn.onlineshop.models.site.Blog
import retrofit2.http.*

interface InvoiceApi {

    @GET("/api/invoice/{id}")
    suspend fun getInvoiceById(@Path("id") id : Long) : ServiceResponce<Invoice>


    @GET("/api/invoice/user/{userId}")
    suspend fun getInvoiceByUserId(@Path("usrId") id : Long ,
    @Query("pageIndex") pageIndex : Int ,
    @Query("pageSize") pageSize:Int) : ServiceResponce<Invoice>

    @POST
    suspend fun addInvoice(@Body invoice: Invoice ,
    @Header("Authorization") token : String) : ServiceResponce<Invoice>
}