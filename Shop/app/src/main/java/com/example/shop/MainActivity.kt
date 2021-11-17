package com.example.shop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun register(view: View){
        val intent = Intent(this, registerMainActivity::class.java)
        startActivity(intent)
    }

    fun login(view: View){
        val intent = Intent(this, productsMainActivity::class.java)
        startActivity(intent)
    }
}