package com.example.shopappf
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface ShopApi {

    @GET("users/{user_surname}/{user_password}")
    fun getUser(): Call<userResponse>

    @FormUrlEncoded()
    @POST()
    fun addUser(
            @Field("name") name:String,
            @Field("surname") surname: String,
            @Field("email") email: String,
            @Field("password") password: String
        ):Call<userResponse>
}