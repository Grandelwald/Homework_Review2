package com.example.homework_review

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.homework_review.databinding.ActivitySignInBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySignInBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySignInBinding.inflate(layoutInflater)
        val homeIntent = Intent(this,HomeActivity::class.java)

        binding.btnLogin.setOnClickListener {
            if(binding.edtvNewid.text==null||binding.edtvNewpw.text==null){
                Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"환영합니다",Toast.LENGTH_SHORT).show()
                startActivity(homeIntent)
            }
        }


        setContentView(binding.root)
    }


}