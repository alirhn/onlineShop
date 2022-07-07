package com.alirhn.onlineshop.models

class ServiceResponce <T>(
    var dataList : List<T> ?= null, var message : String ?= null, var status : String ?= null , var totalCount : Long?= null
        ){
}