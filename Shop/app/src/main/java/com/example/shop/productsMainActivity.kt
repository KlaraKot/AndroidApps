package com.example.shop

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class productsMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.products)
    }

    fun about(view: View){
        val intent = Intent(this, aboutMainActivity::class.java)
        startActivity(intent)
    }
    fun basket(view: View){
        val intent = Intent(this, basketMainActivity::class.java)
        startActivity(intent)
    }

}