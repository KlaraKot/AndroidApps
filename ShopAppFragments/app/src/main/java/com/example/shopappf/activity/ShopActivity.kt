package com.example.shopappf.activity

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.shopappf.ProductAdapter
import com.example.shopappf.R
import com.example.shopappf.dataModels.ProductDB
import io.realm.Realm
import io.realm.RealmConfiguration

class ShopActivity: AppCompatActivity() {

    lateinit var config: RealmConfiguration
    lateinit var realm: Realm
    lateinit var productsRV: RecyclerView
    private lateinit var list: List<ProductDB>
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recycler_user)

        //init views
        productsRV = findViewById(R.id.productsRV)
        button = findViewById(R.id.BTNproducts)

        //realm
        realm = Realm.getDefaultInstance()

        //Transaction
        realm.executeTransaction {
            list = it.where(ProductDB::class.java).findAll()
        }

        button.setOnClickListener{
            //wrzucanie listy z urzytkownikami do adaptera ktory pozniej wrzuca do rycaclerView
            productsRV.adapter = ProductAdapter(list, this)
            productsRV.layoutManager = LinearLayoutManager(this)

        }

    }

    fun goToAccountPage(view: View){
        val intent = Intent(this, AccountPageActivity::class.java)
        startActivity(intent)
    }

}