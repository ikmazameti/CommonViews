package com.mawuliazameti.commonviews

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mawuliazameti.commonviews.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val loginButton: Button = findViewById(R.id.login)

        loginButton.setOnClickListener {
            val username = binding.username.text.toString()
            val password = binding.password.text.toString()

            if (username.isEmpty()) {
                Toast.makeText(this, "Please enter your username!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Login successfully!", Toast.LENGTH_SHORT).show()

                binding.loginMessage.text = "Welcome $username"
                binding.loginMessage.visibility = View.VISIBLE
            }

            //  Toast.makeText(this, "Login button Clicked", Toast.LENGTH_LONG).show()
        }


        binding.rememberMe.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                Toast.makeText(this, "Remember me enabled", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Remember me disabled", Toast.LENGTH_SHORT).show()

            }

        }

    }
}