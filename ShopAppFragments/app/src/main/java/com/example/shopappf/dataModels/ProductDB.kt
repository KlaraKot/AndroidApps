package com.example.shopappf.dataModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class ProductDB : RealmObject() {

    @PrimaryKey
    @SerializedName("productId")
    @Expose
    open var productId: String? = ""

    @SerializedName("name")
    @Expose
    open var name: String? = ""

    @SerializedName("type")
    @Expose
    open var type: String? = ""

    @SerializedName("price")
    @Expose
    open var price: String? = ""

    @SerializedName("weight")
    @Expose
    open var weight: String? = ""

    @SerializedName("categoryId")
    @Expose
    open var categoryId: String? = ""

}