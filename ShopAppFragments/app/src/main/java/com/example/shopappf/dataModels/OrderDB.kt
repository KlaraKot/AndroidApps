package com.example.shopappf.dataModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class OrderDB : RealmObject() {


    @SerializedName("orderId")
    @Expose
    open var orderId: String? = ""

    @SerializedName("userId")
    @Expose
    open var userId: String? = ""

}