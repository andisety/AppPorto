package com.andi.myportofolio

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterPorto(private val listPorto:ArrayList<Porto>):RecyclerView.Adapter<AdapterPorto.AdapterPortoViewHolder>() {
    class AdapterPortoViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvTitle:TextView = itemView.findViewById(R.id.title_certified)
        val tvPaltform:TextView = itemView.findViewById(R.id.platform_certified)
        val ivCertified:ImageView = itemView.findViewById(R.id.img_certified)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPortoViewHolder {
        val view: View =LayoutInflater.from(parent.context).inflate(R.layout.list_data_porto,parent,false)
        return AdapterPortoViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterPortoViewHolder, position: Int) {
        val porto = listPorto[position]
        holder.tvTitle.text=porto.title
        holder.tvPaltform.text="Platform : "+porto.platform
        holder.ivCertified.setImageResource(porto.photo)
    }

    override fun getItemCount(): Int {
        return listPorto.size
    }
}