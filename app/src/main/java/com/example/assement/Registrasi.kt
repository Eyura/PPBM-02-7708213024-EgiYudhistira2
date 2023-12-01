package com.example.assement

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class Registrasi : AppCompatActivity() {

    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registrasi)

        usernameEditText = findViewById(R.id.username1)
        passwordEditText = findViewById(R.id.password1)

        usernameEditText.setOnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_NEXT) {
                // Jika tombol "Enter" ditekan di kolom username, fokus akan beralih ke password
                passwordEditText.requestFocus()
                true
            } else {
                false
            }
        }

        val registerButton: Button = findViewById(R.id.Registrasi)
        registerButton.setOnClickListener {
            val username = usernameEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Username and password cannot be empty", Toast.LENGTH_SHORT)
                    .show()
            } else {
                // Check if username already exists
                if (UserManager.isUsernameExists(username)) {
                    Toast.makeText(this, "Username already exists", Toast.LENGTH_SHORT).show()
                    Log.d("Register", "Username already exists")
                } else {
                    // Register the user
                    val registrationSuccessful = UserManager.registerUser(username, password)

                    if (registrationSuccessful) {
                        Toast.makeText(this, "Registration successful", Toast.LENGTH_SHORT).show()

                        // Pindah ke halaman login
                        val loginIntent = Intent(this, Login::class.java)
                        startActivity(loginIntent)

                        // Optional: Finish RegisterActivity so that user cannot navigate back to it
                        finish()
                    } else {
                        Toast.makeText(this, "Registration failed", Toast.LENGTH_SHORT).show()
                        Log.d("Register", "Registration failed")
                    }
                }
            }
        }
    }
}
