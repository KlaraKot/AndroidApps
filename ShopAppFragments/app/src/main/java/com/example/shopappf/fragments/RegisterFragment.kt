package com.example.shopappf.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.example.shopappf.R
import com.example.shopappf.activity.ShopActivity
import io.realm.Realm


class RegisterFragment : Fragment() {
    var TAG: String = "@@@@@@@@@@@"
    companion object{
        fun newInstance(): LoginFragment {
            return LoginFragment()
        }
    }

    private lateinit var personName:EditText
    private lateinit var personSurname:EditText
    private lateinit var password:EditText
    private lateinit var email:EditText
    private lateinit var registerBTN:Button
    private lateinit var realm: Realm


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{

        val root: View = inflater.inflate(R.layout.fragment_register, container, false)

        //init views
        personName = root.findViewById(R.id.PersonName)
        personSurname = root.findViewById(R.id.PersonSurname)
        email = root.findViewById(R.id.PersonEmail)
        password = root.findViewById(R.id.PersonPassword)
        registerBTN = root.findViewById(R.id.buttonRegister)



        //realm
        realm = Realm.getDefaultInstance()

        val name = personName.text.toString().trim()
        val surname = personSurname.text.toString().trim()
        val email = email.text.toString().trim()
        val password = password.text.toString().trim()

        root.findViewById<Button>(R.id.buttonRegister).setOnClickListener {
            Log.i(TAG, "onResume fired!")
            val intent = Intent(activity, ShopActivity::class.java)
            startActivity(intent)
        }


        //  registerBTN.setOnClickListener {

             // val i =  Intent(context, ShopActivity::class.java)
               //  startActivity(i)

              /*realm.executeTransactionAsync{
                  val newUser = UserDB()
                  newUser.name = name
                  newUser.surname = surname
                  newUser.email = email
                  newUser.passwordHash = password

                  realm.copyToRealmOrUpdate(newUser)
                  realm.commitTransaction()*/
            //  }

              //Toast.makeText(this,"User registered", Toast.LENGTH_SHORT).show()
            //  val i =  Intent(context, ShopActivity::class.java)
           //   startActivity(i)
              //przeniesienie do shopActivity

       //   }

        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    fun goToShop(view: View){
        val i =  Intent(context, ShopActivity::class.java)
        startActivity(i)
    }

    }
