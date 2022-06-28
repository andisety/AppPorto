package com.andi.myportofolio

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class BottomSheetFragment:BottomSheetDialogFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.layout_bottom_sheet,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        showView(view)
    }


    private fun showView(view: View){
        val btnClose = view.findViewById<ImageView>(R.id.btn_close_bottom_view)
        val instagram = view.findViewById<ImageView>(R.id.instgram)
        val whatsapp = view.findViewById<ImageView>(R.id.whatsapp)
        btnClose.setOnClickListener {
            val manager = requireActivity().supportFragmentManager
            manager.beginTransaction().remove(this).commit()
        }
        instagram.setOnClickListener {openInstagram()}
        whatsapp.setOnClickListener { openWhatsapp() }

    }

    private fun openWhatsapp() {
        val uri:Uri=Uri.parse("https://api.whatsapp.com/send?phone=6283866516952")
        val intentWhatsapp = Intent(Intent.ACTION_VIEW,uri)
        intentWhatsapp.setPackage("com.whatsapp")
        try{
            startActivity(intentWhatsapp)
        }catch (e:ActivityNotFoundException){
            Toast.makeText(activity,"Aplication Not found",Toast.LENGTH_SHORT).show()
        }finally {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://wa.me/6283866516952")
            )
            startActivity(webIntent)
        }
    }

    private fun openInstagram(){
        val uri:Uri=Uri.parse("https://instagram.com/andisetyo_p")
        val intentInstagram = Intent(Intent.ACTION_VIEW,uri)
        intentInstagram.setPackage("com.instagram.android")
        try{
            startActivity(intentInstagram)
        }catch (e:ActivityNotFoundException){
            Toast.makeText(activity,"Aplication Not found",Toast.LENGTH_SHORT).show()
        }finally {
            val webIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/andisetyo_p")
            )
            startActivity(webIntent)
        }
    }
}