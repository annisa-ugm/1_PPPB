package com.example.uts_pppb1_annisamr

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_pppb1_annisamr.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btnSubmit.setOnClickListener {
                val name = fieldInputUsername.text.toString()

                if (name.isEmpty()) {
                    Toast.makeText(this@SecondActivity, "Enter your name first", Toast.LENGTH_SHORT).show()
                    return@setOnClickListener
                }

                val intentToMainActivity =
                    Intent(this@SecondActivity, MainActivity::class.java)
                intentToMainActivity.putExtra("EXTRA_NAME", fieldInputUsername.text.toString())
                startActivity(intentToMainActivity)
                finish()
            }
        }
    }
}