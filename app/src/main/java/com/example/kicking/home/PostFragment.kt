package com.example.kicking.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kicking.R
import com.example.kicking.base.BaseFragment
import com.example.kicking.databinding.FragmentPostBinding

class PostFragment : BaseFragment<FragmentPostBinding>(R.layout.fragment_post) {


    override fun init() {
        initAppbar(binding.postToolbar, "포스트", true, false)
    }


}