package com.example.shopappf
import com.example.shopappf.dataModels.ProductDB
import com.example.shopappf.dataModels.UserDB
import com.example.shopappf.utils.connection
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.*

interface ShopApi {



    @GET("products")
    @Headers("Content-Type: application/json")
    fun getProducts() : Observable<List<ProductDB>>

    @GET("/user/all/")
    @Headers("Content-Type: application/json")
    fun getUser(): Observable<List<UserDB>>


    @GET("user/get/{id}")
    fun getById(@Query("id") userId: String): Call<List<MyDataItem>>


    @FormUrlEncoded()
    @POST("/addUser")
    fun addUser(
            @Field("userId") userId:String,
            @Field("email") email: String,
            @Field("name") name:String,
            @Field("surname") surname: String,
            @Field("password") password: String
        ):Call<List<MyDataItem>>


    companion object {
        fun create() : ShopApi {
            return connection().retrofit.create(ShopApi::class.java)
        }

    }

    }