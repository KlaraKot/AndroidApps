package com.example.shopappf

import com.google.gson.annotations.SerializedName

import java.util.ArrayList

class ShopResponse {

    @SerializedName("teaCollection")
    var TeaCollection = ArrayList<teaCollection>()
    @SerializedName("coffeeCollection")
    var CoffeeCollection = ArrayList<coffeeCollection>()


}

class teaCollection{
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("name")
    var name: String? = null
    @SerializedName("price")
    var price: Int = 0
}

class coffeeCollection{
    @SerializedName("id")
    var id: Int = 0
    @SerializedName("name")
    var name: String? = null
    @SerializedName("price")
    var price: Int = 0
}