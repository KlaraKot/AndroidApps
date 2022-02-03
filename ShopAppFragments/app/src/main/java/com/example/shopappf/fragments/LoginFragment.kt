package com.example.shopappf.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.shopappf.R
import io.realm.Realm

class LoginFragment : Fragment() {
    private lateinit var email: EditText
    private lateinit var password:EditText
    private lateinit var realm: Realm

    companion object{
        fun newInstance(): LoginFragment {
            return LoginFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{

        val root: View = inflater.inflate(R.layout.fragment_login, container, false)
        //val loginButton : Button = root.findViewById<Button>(R.id.loginBTN)
        email = root.findViewById(R.id.emailText)
        password = root.findViewById(R.id.passwordText)

        val email = email.text.toString().trim()
        val password = password.text.toString().trim()

/*

        loginButton.setOnClickListener{
            realm.beginTransaction()

            realm.executeTransaction {

                val result = realm.where(UserDB::class.java)
                    .equalTo("email", email)
                    .and()
                    .equalTo("passwordHash", password)
                    .findAll()

                if(result != null){
                    val i =  Intent(context, ShopActivity::class.java)
                    startActivity(i)
                }
                else{
                    //toast -> zły login lub hasło
                }
            }
        }*/


        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}
