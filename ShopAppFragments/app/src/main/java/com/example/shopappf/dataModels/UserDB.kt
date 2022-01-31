package com.example.shopappf.dataModels

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.annotations.RealmClass

@RealmClass
open class UserDB : RealmObject() {

    @PrimaryKey
    @SerializedName("userId")
    @Expose
    open var userId: String? = ""

    @SerializedName("email")
    @Expose
    open var email: String? = ""

    @SerializedName("name")
    @Expose
    open var name: String? = ""

    @SerializedName("surname")
    @Expose
    open var surname: String? = ""

    @SerializedName("passwordHash")
    @Expose
    open var passwordHash: String? = ""

}