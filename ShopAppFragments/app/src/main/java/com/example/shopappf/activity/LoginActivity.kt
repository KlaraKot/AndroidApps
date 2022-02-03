package com.example.shopappf.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.shopappf.R

class LoginActivity:AppCompatActivity() {
    private lateinit var loginBTN: Button
    private lateinit var email: EditText
    private lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_login)

        loginBTN = findViewById(R.id.loginBTN)
        email = findViewById(R.id.emailText)
        password = findViewById(R.id.passwordText)

        val email = email.text.toString().trim()
        val password = password.text.toString().trim()

        loginBTN.setOnClickListener{

            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }
    }
}




