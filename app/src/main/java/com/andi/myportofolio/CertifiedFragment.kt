package com.andi.myportofolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CertifiedFragment : Fragment() {
    lateinit var adapter:AdapterPorto
    lateinit var listPorto: ArrayList<Porto>
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_certified, container, false)
        buildDisplayData()
        showView(view)
        return view
    }

    private fun buildDisplayData(){
        listPorto = arrayListOf()
        listPorto.addAll(PortoData.listData)

    }

    private fun showView(view: View){
        val rvPorto = view.findViewById<RecyclerView>(R.id.rv_detail)
        rvPorto.layoutManager = LinearLayoutManager(activity)
        adapter = AdapterPorto(listPorto)
        rvPorto.adapter=adapter
    }

}