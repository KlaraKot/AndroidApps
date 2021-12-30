package com.example.shopappf

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
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

        fun goToShop(view: View){
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }
    }
