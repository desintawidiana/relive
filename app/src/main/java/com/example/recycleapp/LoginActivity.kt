package com.example.recycleapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        // Menyesuaikan padding untuk sistem bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Menetapkan listener pada tombol untuk menuju ke SignUpActivity
        findViewById<Button>(R.id.button1).setOnClickListener {
            val intent = Intent(this, sign_Up::class.java)
            startActivity(intent)
        }

        // Menetapkan listener pada tombol untuk menuju ke LoginActivity
        findViewById<Button>(R.id.button2).setOnClickListener {
            val intent = Intent(this, RealLoginActivity::class.java)
            startActivity(intent)
        }
    }
}
