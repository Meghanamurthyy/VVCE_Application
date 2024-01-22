package com.example.vvce

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VvcePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vvce_page)
        val contactButton:Button = findViewById(R.id.btn_contact)
        contactButton.setOnClickListener {
            val contactIntent = Intent(Intent.ACTION_DIAL)
            contactIntent.data = Uri.parse("tel:"+8792299636)
            startActivity(contactIntent)
        }
        val aboutButton:Button = findViewById(R.id.btn_about)
        aboutButton.setOnClickListener {
            val aboutIntent = Intent(Intent.ACTION_VIEW)
            val url = "vvce.ac.in/about-us/"
            aboutIntent.data = Uri.parse("http://" +url)
            startActivity(aboutIntent)
        }
        val placeButton:Button = findViewById(R.id.btn_placement)
        placeButton.setOnClickListener {
            val placeIntent = Intent(Intent.ACTION_VIEW)
            val placement = "vvce.ac.in/department/training-and-placement/"
            placeIntent.data = Uri.parse("http://"+placement)
            startActivity(placeIntent)
        }
    }
}