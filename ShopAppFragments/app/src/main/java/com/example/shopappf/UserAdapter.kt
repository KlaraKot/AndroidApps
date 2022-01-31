package com.example.shopappf

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopappf.dataModels.UserDB

class UserAdapter(private var UserList: List<UserDB>, context: Context): RecyclerView.Adapter<UserAdapter.UserViewHolder>() {
    private val clickHandler: ProductOnClickHandler = context as ProductOnClickHandler
    class UserViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
            val name1 = itemView.findViewById<TextView>(R.id.user_name)
            val surname1 = itemView.findViewById<TextView>(R.id.user_surname)
            val email1 = itemView.findViewById<TextView>(R.id.user_email)
    }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item_layout, parent, false)
      return UserViewHolder(view).also {
          view.setOnClickListener{ clickHandler.onClickHandler(it) }
      }
    }

    override fun getItemCount(): Int {
        return UserList.size
    }

   override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.name1.text = UserList[position]!!.name
        holder.surname1.text = UserList[position]!!.surname
        holder.email1.text = UserList[position]!!.email
    }
}

