package com.andi.myportofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class DetailActivity : AppCompatActivity() {
    lateinit var rvPorto:RecyclerView
    lateinit var listPorto:ArrayList<Porto>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
        rvPorto=findViewById(R.id.rv_detail)
        listPorto= arrayListOf()
        listPorto.addAll(PortoData.listData)
        rvPorto.layoutManager=LinearLayoutManager(this,)
        rvPorto.adapter=AdapterPorto(listPorto)

//        val mfragment=supportFragmentManager
//        val fragmentCertified = CertifiedFragment()
//        mfragment.beginTransaction()
//            .add(R.id.fr_container,fragmentCertified,CertifiedFragment::class.java.simpleName)
//            .addToBackStack(null)
//            .commit()

    }
}