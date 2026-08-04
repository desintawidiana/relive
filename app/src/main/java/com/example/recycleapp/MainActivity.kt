package com.example.recycleapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.SpannableString
import android.text.Spanned
import android.text.style.ForegroundColorSpan
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Setting warna pada teks Re dan Life
        val appName = findViewById<TextView>(R.id.appName)
        val spannable = SpannableString("ReLife")
        spannable.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.hijau)),
            0, 2, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        ) // "Re"
        spannable.setSpan(
            ForegroundColorSpan(ContextCompat.getColor(this, R.color.hijau2)),
            2, 6, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE
        ) // "Life"
        appName.text = spannable

        // Menunda transisi ke LoginActivity selama 3 detik
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, LoginActivity::class.java))
            finish() // Menutup MainActivity agar tidak bisa kembali ke splash screen
        }, 3000) // 3 detik

        // Mengatur padding untuk status bar dan navigasi
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.logoImage)) { v, insets ->
            val systemBarsInsets = insets.systemGestureInsets
            v.setPadding(systemBarsInsets.left, systemBarsInsets.top, systemBarsInsets.right, systemBarsInsets.bottom)
            insets
        }
    }
}
