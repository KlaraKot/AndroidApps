package com.example.shopappf

import com.google.gson.annotations.SerializedName


class MyData : ArrayList<MyDataItem>()



data class MyDataItem (
    @SerializedName("id")
    var id: Int? =null,
    @SerializedName("name")
    var name: String? =null,
    @SerializedName("surname")
    var surname: String? =null,
    @SerializedName("email")
    var email: String? =null
)






