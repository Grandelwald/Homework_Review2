package com.example.homework_review

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework_review.databinding.ActivitySignInBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }


}