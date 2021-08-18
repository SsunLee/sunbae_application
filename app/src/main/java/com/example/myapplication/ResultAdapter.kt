package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class ResultAdapter(private val context: Context) :
RecyclerView.Adapter<ResultAdapter.ViewHolder>() {

    var datas = mutableListOf<CashData>()

    // ----------------------------------------------------------------------
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_recycler,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }
    // ----------------------------------------------------------------------



    // 왜 하는지
    inner class ViewHolder(view: View) :
            RecyclerView.ViewHolder(view) {
                private val txtName: TextView = itemView.findViewById(R.id.tv_rv_name)
                private val txtAge: TextView = itemView.findViewById(R.id.tv_rv_age)
                private val imgProfile: ImageView = itemView.findViewById(R.id.img_rv_photo)

                fun bind(item: CashData) {
                    txtName.text = item.name
                    txtAge.text = item.age.toString()
                    Glide.with(itemView).load(item.img).into(imgProfile)

                }
            }

}