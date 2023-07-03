package com.example.kicking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kicking.databinding.FragmentMycontentBinding
import com.example.kicking.home.PostFragment

class MycontentFragment: Fragment() {
    private lateinit var viewBinding: FragmentMycontentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        viewBinding = FragmentMycontentBinding.inflate(layoutInflater)
//        viewBinding.btnMakectt.setOnClickListener {
//        }
        return viewBinding.root
    }

}