package com.example.shopappf.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.shopappf.R

class MainActivity : AppCompatActivity() {
    private lateinit var registerBTN: Button
    private lateinit var loginBTN: Button
    private lateinit var shopBTN: Button



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        registerBTN = findViewById(R.id.btnRegister)
        loginBTN = findViewById(R.id.btnLogin)
        shopBTN = findViewById(R.id.btnGoToShop)

        registerBTN.setOnClickListener{


            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        loginBTN.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        shopBTN.setOnClickListener {
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }


    }
}