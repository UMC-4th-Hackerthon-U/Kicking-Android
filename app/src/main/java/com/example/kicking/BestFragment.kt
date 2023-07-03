package com.example.kicking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kicking.databinding.FragmentBestBinding
import com.example.kicking.databinding.FragmentHomeBinding

class BestFragment : Fragment() {
    lateinit var binding : FragmentBestBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBestBinding.inflate(inflater, container, false)

        return binding.root
    }

}