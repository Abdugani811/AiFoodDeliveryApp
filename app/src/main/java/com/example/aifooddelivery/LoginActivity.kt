package com.example.aifooddelivery

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.aifooddelivery.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.signUp.setOnClickListener {
            Intent(this, CreateAccountActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.forgotTv.setOnClickListener {
            Intent(this, ForgotPasswordActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.signInBtn.setOnClickListener {
            Intent(this, MainActivity::class.java).apply {
                startActivity(this)
            }
        }

    }
}