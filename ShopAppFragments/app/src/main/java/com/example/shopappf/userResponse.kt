package com.example.shopappf

import com.google.gson.annotations.SerializedName

data class userResponse (
    @SerializedName("userId")
    var userId: Int? =null,
    @SerializedName("email")
    var email: String? =null,
    @SerializedName("name")
    var name: String? =null,
    @SerializedName("surname")
    var surname: String? =null,
    @SerializedName("password")
    var passwordHash: String? =null
)




