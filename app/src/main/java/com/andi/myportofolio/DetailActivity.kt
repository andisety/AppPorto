package com.andi.myportofolio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.lang.IllegalArgumentException

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_detail)
        supportActionBar?.setTitle("MyCertificate")


        val fragmentCertified: Fragment = CertifiedFragment()
        val fragmentAbout: Fragment = AboutFragment()
        val transaksion = supportFragmentManager.beginTransaction()
        val session = intent.getStringExtra("key")

        when(session){
            "certificate"->{
                transaksion
                    .replace(R.id.fr_container, fragmentCertified, CertifiedFragment::class.java.simpleName)
                    .commit()
                }
            "about"->{
                transaksion
                    .replace(R.id.fr_container, fragmentAbout, AboutFragment::class.java.simpleName)
                    .commit()
            }
        }
    }
}



