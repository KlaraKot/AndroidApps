package com.example.shopappf

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.content.Intent
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentContainer

class LoginFragment : Fragment() {

    companion object{
        fun newInstance(): LoginFragment{
            return LoginFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{

        val root: View = inflater!!.inflate(R.layout.fragment_login, container, false)
        val button1 : Button = root.findViewById<Button>(R.id.button5)

        button1.setOnClickListener{
             fun onClick(view: View){
                 requireActivity().run{
                     startActivity(Intent(this, ShopActivity::class.java))

                 }
            }
        }

        return inflater.inflate(R.layout.fragment_login, container, false)
    }

}