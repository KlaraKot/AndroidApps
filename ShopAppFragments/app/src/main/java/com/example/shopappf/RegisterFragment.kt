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

class RegisterFragment : Fragment() {

    companion object{
        fun newInstance(): LoginFragment{
            return LoginFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View?{

        val root: View = inflater!!.inflate(R.layout.fragment_register, container, false)
        val button1 : Button = root.findViewById<Button>(R.id.buttonRegister)

        button1.setOnClickListener{
            requireActivity().run{
                startActivity(Intent(this, ShopActivity::class.java))
                finish()
            }
        }

        return inflater.inflate(R.layout.fragment_register, container, false)
    }

}