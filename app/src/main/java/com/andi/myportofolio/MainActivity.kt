package com.andi.myportofolio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout

import com.andi.myportofolio.databinding.ActivityMainBinding
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

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
        binding.btnAbout.setOnClickListener(this)
        binding.btnSocial.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v){
            binding.btnAbout->{
                startActivity(Intent(this,DetailActivity::class.java)
                    .putExtra("key","about")
                )
            }
            binding.btnCertified->{
                startActivity(Intent(this,DetailActivity::class.java)
                    .putExtra("key","certificate")
                )
            }
            binding.btnSocial->{
                val bottomFragment = BottomSheetFragment()
                bottomFragment.setStyle(BottomSheetDialogFragment.STYLE_NORMAL,R.style.bottomSheetDiaolog)
                bottomFragment.show(supportFragmentManager,BottomSheetFragment::class.java.simpleName)



            }
        }
    }
}