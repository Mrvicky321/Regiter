package com.example.regiter

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.regiter.R.id.xml_button

class loginpage_Activity : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_loginpage)
        var button1 = findViewById<TextView>(R.id.button2)
        button1.setOnClickListener {
            val intent1 =  Intent(this, RegiterActivity::class.java)
            startActivity(intent1)
        }
    }
}