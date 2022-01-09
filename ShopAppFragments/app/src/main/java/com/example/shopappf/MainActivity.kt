package com.example.shopappf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {

    companion object {
        var BaseUrl = "http://285d-83-10-0-76.ngrok.io"
    }

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = LoginFragment()
        val secondFragment = RegisterFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragment, firstFragment)
            commit()
        }

        lateinit var buttonL : Button
        buttonL = findViewById(R.id.btnLogin)

        buttonL.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment, firstFragment)
                commit()
            }
        }

        lateinit var buttonR : Button
        buttonR = findViewById(R.id.btnRegister)

        buttonR.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment, secondFragment)
                commit()
            }
        }

        }


        internal fun getUsers(){
            val retrofit = Retrofit.Builder()
                .baseUrl(BaseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            val service = retrofit.create(ShopApi::class.java)

            val call: Call<userResponse> = service.getUser()
            call.enqueue(object : Callback<userResponse> {
                override fun onResponse(call: Call<userResponse>, response: Response<userResponse>) {
                    if (response.code() == 200) {
                        val output = response.body()!!

                    }
                }

                override fun onFailure(call: Call<userResponse>?, t: Throwable?) {
                    TODO("Not yet implemented")
                }
            })


        }

        fun goToShop(view: View){
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }
    }
