package com.example.shopappf.activity

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.shopappf.R
import com.example.shopappf.dataModels.UserDB
import io.realm.Realm

class RegisterActivity:AppCompatActivity() {

    private lateinit var personName: EditText
    private lateinit var personSurname: EditText
    private lateinit var password: EditText
    private lateinit var email: EditText
    private lateinit var registerBTN: Button
    private lateinit var realm: Realm


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_register)


        personName = findViewById(R.id.PersonName)
        personSurname = findViewById(R.id.PersonSurname)
        email = findViewById(R.id.PersonEmail)
        password = findViewById(R.id.PersonPassword)
        registerBTN = findViewById(R.id.buttonRegister)

        val name = personName.text.toString().trim()
        val surname = personSurname.text.toString().trim()
        val email = email.text.toString().trim()
        val password = password.text.toString().trim()

        registerBTN.setOnClickListener {

            realm = Realm.getDefaultInstance()
            realm.executeTransactionAsync {

                val newUser = UserDB()
                newUser.name = name
                newUser.surname = surname
                newUser.email = email
                newUser.passwordHash = password

                realm.copyToRealmOrUpdate(newUser)
                realm.commitTransaction()

            }
            val intent = Intent(this, ShopActivity::class.java)
            startActivity(intent)
        }


    }
}