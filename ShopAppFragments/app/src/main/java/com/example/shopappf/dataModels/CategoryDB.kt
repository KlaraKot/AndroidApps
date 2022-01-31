package com.example.shopappf.dataModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class CategoryDB : RealmObject() {

    @PrimaryKey
    @SerializedName("categoryId")
    @Expose
    open var categoryId: String? = ""

    @SerializedName("categoryName")
    @Expose
    open var categoryName: String? = ""

}