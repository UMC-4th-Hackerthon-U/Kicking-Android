package com.example.kicking

import MypageVPAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kicking.base.BaseFragment
import com.example.kicking.databinding.FragmentMypageBinding
import com.google.android.material.tabs.TabLayoutMediator

class MypageFragment : BaseFragment<FragmentMypageBinding>(R.layout.fragment_mypage) {
    override fun init() {
        initAppbar(binding.mypageToolbar, "보드", false, true)
        initTab()
    }

    private fun initTab() {

        val mainVPAdapter = super.getActivity()?.let { MypageVPAdapter(fragmentActivity = it) }
        binding.vpMain.adapter = mainVPAdapter

        val tabTitleArray = arrayOf(
            "콘텐츠",
            "보드",
        )
        TabLayoutMediator(binding.tabMain, binding.vpMain) { tab, position ->
            tab.text = tabTitleArray[position]
        }.attach()


    }}