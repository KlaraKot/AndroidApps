package com.example.shopappf.dataModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass


@RealmClass
open class OrderDeatilsDB : RealmObject() {

    @PrimaryKey
    @SerializedName("orderId")
    @Expose
    open var orderId: String? = ""

    @SerializedName("productId")
    @Expose
    open var productId: ProductDB? = null

    @SerializedName("price")
    @Expose
    open var price: String? = ""

    @SerializedName("quantity")
    @Expose
    open var quantity: String? = ""

}