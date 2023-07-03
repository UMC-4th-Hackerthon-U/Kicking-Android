package com.example.kicking

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.content.ContextCompat
import com.example.kicking.databinding.ActivityFirstBinding
import com.example.kicking.databinding.ActivitySplashBinding

class SplashActivity: AppCompatActivity() {
    private lateinit var binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.statusBarColor = ContextCompat.getColor(this, R.color.primary)
        Handler().postDelayed(Runnable {
            val intent = Intent(applicationContext, FirstActivity::class.java)
            startActivity(intent)
            finish()
        }, (1000 * 2).toLong())
    }
}