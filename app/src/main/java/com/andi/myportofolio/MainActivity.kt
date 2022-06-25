package com.andi.myportofolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.andi.myportofolio.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),View.OnClickListener {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        binding.btnCertified.setOnClickListener {
            startActivity(Intent(this,DetailActivity::class.java))
        }

    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn_about->{

            }
            R.id.btn_certified->{
                startActivity(Intent(this,DetailActivity::class.java))
            }
            R.id.btn_project->{

            }
        }
    }
}