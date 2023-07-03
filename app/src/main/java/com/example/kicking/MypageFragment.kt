package com.example.kicking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kicking.databinding.FragmentHomeBinding
import com.example.kicking.databinding.FragmentMypageBinding

class MypageFragment : Fragment() {
    lateinit var binding : FragmentMypageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMypageBinding.inflate(inflater, container, false)

        return binding.root
    }

}