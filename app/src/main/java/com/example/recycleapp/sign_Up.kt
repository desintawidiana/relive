package com.example.recycleapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sign_Up : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var userNameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var signUpButton: Button

    companion object {
        var name = "Florentina Junita Meot"
        var userName = "flo"
        var email = "floren@gmail.com"
        var password ="floreng3m3z"

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)

        // Initialize edge-to-edge padding for immersive experience
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        // Initialize views
        nameEditText = findViewById(R.id.name)
        userNameEditText = findViewById(R.id.userName)
        emailEditText = findViewById(R.id.email)
        passwordEditText = findViewById(R.id.password)
        signUpButton = findViewById(R.id.button3)

        // Set onClickListener for the sign-up button
        signUpButton.setOnClickListener {
            // Retrieve input values
            val name = nameEditText.text.toString()
            val userName = userNameEditText.text.toString()
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            // Basic validation for empty fields
            if (name.isEmpty() || userName.isEmpty() || email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Show a message on successful sign-up
                Toast.makeText(this, "Sign up successful!", Toast.LENGTH_SHORT).show()

                // Clear fields after signup
                nameEditText.text.clear()
                userNameEditText.text.clear()
                emailEditText.text.clear()
                passwordEditText.text.clear()
            }
        }
        findViewById<Button>(R.id.button3).setOnClickListener {
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }
    }
}
