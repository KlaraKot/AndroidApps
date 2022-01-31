package com.example.shopappf.activity

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.shopappf.fragments.AboutFragment
import com.example.shopappf.fragments.AccountFragment
import com.example.shopappf.fragments.BasketFragments
import com.example.shopappf.R

class AccountPageActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.account_page_activity)

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