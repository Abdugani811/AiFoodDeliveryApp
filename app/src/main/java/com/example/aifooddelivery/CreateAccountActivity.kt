package com.example.aifooddelivery

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aifooddelivery.databinding.ActivityCreateAccountBinding
import com.example.aifooddelivery.databinding.ActivityLoginBinding

class CreateAccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCreateAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.registerBtn.setOnClickListener {
            Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
            }
        }

        binding.signIn.setOnClickListener {
            Intent(this, LoginActivity::class.java).apply {
                startActivity(this)
            }
        }
    }
}