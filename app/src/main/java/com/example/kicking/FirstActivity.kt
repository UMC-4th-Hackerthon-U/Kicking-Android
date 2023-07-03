package com.example.kicking

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kicking.databinding.ActivityFirstBinding

class FirstActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}