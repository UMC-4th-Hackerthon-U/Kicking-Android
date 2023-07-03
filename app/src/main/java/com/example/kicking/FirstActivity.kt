package com.example.kicking

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.view.KeyEvent
import android.view.KeyEvent.KEYCODE_ENTER
import android.view.View
import android.view.animation.AnimationUtils
import android.view.inputmethod.InputMethodManager
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.example.kicking.databinding.ActivityFirstBinding

class FirstActivity: AppCompatActivity() {

    private lateinit var binding: ActivityFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = ContextCompat.getColor(this, R.color.white)

        binding.firstWhenEt.setOnClickListener {
            setWhen()
        }
        binding.firstWhereEt.setOnKeyListener { view, keyCode, event ->
            // Enter Key Action
            if (event.action == KeyEvent.ACTION_DOWN
                && keyCode == KeyEvent.KEYCODE_ENTER
            ) {
                // 키패드 내리기
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(binding.firstWhereEt.windowToken, 0)
                binding.firstInputInfoTv.text = "한가지를 선택해주세요"
                true
            }

            false
        }
        binding.firstHowEt.setOnClickListener {
            setHow()
        }

        binding.firstWhatEt.setOnKeyListener { view, keyCode, event ->
            // Enter Key Action
            if (event.action == KeyEvent.ACTION_DOWN
                && keyCode == KeyEvent.KEYCODE_ENTER
            ) {
                // 키패드 내리기
                val imm = getSystemService(INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(binding.firstWhatEt.windowToken, 0)
                binding.firstInputInfoTv.text = "흑역사가 된 감정을 입력해주세요"
                true
            }

            false
        }

        binding.firstFeelEt.setOnKeyListener { view, keyCode, event ->
            if (event.action == KeyEvent.ACTION_DOWN && keyCode == KEYCODE_ENTER) {
                binding.firstInputCl.visibility = View.INVISIBLE
                binding.firstNextBtn.visibility = View.VISIBLE

            }
            true
        }
        binding.firstNextBtn.setOnClickListener{
            val intent = Intent(applicationContext, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun setWhen(){
        val anim = AnimationUtils.loadAnimation(this,R.anim.anim_alpha)
        binding.firstMyCl.startAnimation(anim)
        binding.firstWhenEt.requestFocus()
        binding.firstInputCl.visibility = View.VISIBLE
        binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text_selected)

        binding.firstSelect1Tv.setOnClickListener {
            binding.firstWhenEt.text = "과거"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 생긴 장소를 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
        binding.firstSelect2Tv.setOnClickListener {
            binding.firstWhenEt.text = "현재"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 생긴 장소를 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
        binding.firstSelect3Tv.setOnClickListener {
            binding.firstWhenEt.text = "미래"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 생긴 장소를 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
    }
    private fun setWhere(){

    }
    private fun setHow(){
        binding.firstSelect1Tv.text = "혼자"
        binding.firstSelect2Tv.text = "둘이"
        binding.firstSelect3Tv.text = "다수 앞에"
        binding.firstButtonCl.visibility = View.VISIBLE
        binding.firstSelect1Tv.setOnClickListener {
            binding.firstHowEt.text = "혼자"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 된 행동을 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
        binding.firstSelect2Tv.setOnClickListener {
            binding.firstHowEt.text = "둘이"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 된 행동을 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
        binding.firstSelect3Tv.setOnClickListener {
            binding.firstHowEt.text = "다수 앞에"
            binding.firstButtonCl.visibility = View.INVISIBLE
            binding.firstInputInfoTv.text = "흑역사가 된 행동을 입력해주세요"
            binding.firstWhenEt.setBackgroundResource(R.drawable.edt_text)
        }
    }
    private fun setWhat(){

    }
    private fun setFeel(){

    }
}