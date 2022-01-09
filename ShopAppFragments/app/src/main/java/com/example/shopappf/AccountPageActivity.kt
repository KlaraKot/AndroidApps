package com.example.shopappf

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AccountPageActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val account = AccountFragment()
        val basket = BasketFragments()
        val about = AboutFragment()

        supportFragmentManager.beginTransaction().apply{
            replace(R.id.flFragmentAccount, account)
            commit()
        }

        lateinit var buttonA : Button
        buttonA = findViewById(R.id.account)

        lateinit var buttonB : Button
        buttonB = findViewById(R.id.basket)

        lateinit var buttonAb : Button
        buttonAb = findViewById(R.id.about)

        buttonA.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragmentAccount, account)
                commit()
            }
        }

        buttonB.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragmentAccount, basket)
                commit()
            }
        }

        buttonAb.setOnClickListener{
            supportFragmentManager.beginTransaction().apply{
                replace(R.id.flFragmentAccount, about)
                commit()
            }
        }

    }
}