package com.example.regiter

import android.content.Intent
import android.os.Bundle
import android.os.Looper
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class splash_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_splash)
        android.os.Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this,RegiterActivity::class.java))
            finish()
        } ,3000)
    }
}