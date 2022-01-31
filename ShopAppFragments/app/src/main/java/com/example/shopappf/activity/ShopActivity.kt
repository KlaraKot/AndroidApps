package com.example.shopappf.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.shopappf.R
import com.example.shopappf.activity.AccountPageActivity
import com.example.shopappf.fragments.Coffee
import com.example.shopappf.fragments.Tea

class ShopActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.shop_activity)

        val teaFragment = Tea()
        val coffeeFragment = Coffee()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragment2, teaFragment)
            commit()
        }

        lateinit var buttonT : Button
        buttonT = findViewById(R.id.teaBTN)

        buttonT.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment2, teaFragment)
                commit()
            }
        }

        lateinit var buttonC : Button
        buttonC = findViewById(R.id.coffeeBTN)

        buttonC.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragment2, coffeeFragment)
                commit()
            }
        }


    }

    fun goToAccountPage(view: View){
        val intent = Intent(this, AccountPageActivity::class.java)
        startActivity(intent)
    }


}