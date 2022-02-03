package com.example.shopappf

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.shopappf.dataModels.ProductDB

class ProductAdapter(private var ProductList: List<ProductDB>, context: Context): RecyclerView.Adapter<ProductAdapter.UserViewHolder>() {

    class UserViewHolder(itemView:View): RecyclerView.ViewHolder(itemView) {
            val name1 = itemView.findViewById<TextView>(R.id.product_name)
            val type1 = itemView.findViewById<TextView>(R.id.product_type)
            val price1 = itemView.findViewById<TextView>(R.id.product_price)
    }

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {

        val view = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view_item_layout, parent, false)
      return UserViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ProductList.size
    }

   override fun onBindViewHolder(holder: UserViewHolder, position: Int) {

        holder.name1.text = ProductList[position]!!.name
        holder.type1.text = ProductList[position]!!.type
        holder.price1.text = ProductList[position]!!.price
    }
}

