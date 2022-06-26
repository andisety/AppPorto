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
        supportActionBar?.hide()

        initiationButton()

    }

    private fun initiationButton() {
        binding.btnCertified.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnAbout->{

            }
            binding.btnCertified->{
                startActivity(Intent(this,DetailActivity::class.java))
            }
            binding.btnProject->{

            }
        }
    }
}