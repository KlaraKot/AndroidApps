package com.example.shopappf.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import com.example.shopappf.R
import com.example.shopappf.activity.ShopActivity
import io.realm.Realm


class RegisterFragment : Fragment() {

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

        val root: View = inflater!!.inflate(R.layout.fragment_register, container, false)
        val button1 : Button = root.findViewById<Button>(R.id.buttonRegister)



        button1.setOnClickListener{
            requireActivity().run{
                startActivity(Intent(this, ShopActivity::class.java))
                finish()
            }
        }


        //init views
      //  personName = root.findViewById(R.id.PersonName)
      //  personSurname = root.findViewById(R.id.PersonSurname)
      //  email = root.findViewById(R.id.PersonEmail)
      //  password = root.findViewById(R.id.PersonPassword)
        //  realm = Realm.getDefaultInstance()


        registerBTN = root.findViewById(R.id.buttonRegister)


        /*  registerBTN.setOnClickListener {

            val name = PersonName.text.toString().trim()
             val surname = PersonSurname.text.toString().trim()
             val email = PersonEmail.text.toString().trim()
             val password = PersonPassword.text.toString().trim()

             val response = RetrofitInstance.api.addUser("id12",email, name, surname,password)
             response.enqueue(object : Callback<userResponse> {
                 override fun onResponse(call: Call<userResponse>, response: Response<userResponse>)
                 {
                     if (response.code() == 200) {
                         Toast.makeText(getApplicationContext(), "User added Successfully", Toast.LENGTH_SHORT)
                     }
                 }

                 override fun onFailure(call: Call<userResponse>, t: Throwable?) {
                     Toast.makeText(getApplicationContext(), "sth went wrong", Toast.LENGTH_SHORT)
                 }
             })

         }*/

        return inflater.inflate(R.layout.fragment_register, container, false)
    }



    }
