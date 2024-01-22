package com.example.vvce

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNext : Button = findViewById(R.id.btn_next)
        buttonNext.setOnClickListener {
            Toast.makeText(this,"Taking you to VVCE App",Toast.LENGTH_SHORT).show()
            val intent = Intent(this,VvcePage::class.java)
            startActivity(intent)

        }
    }
}