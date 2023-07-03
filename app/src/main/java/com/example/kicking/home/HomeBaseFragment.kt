package com.example.kicking.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kicking.R
import com.example.kicking.base.BaseFragment
import com.example.kicking.databinding.FragmentHomeBaseBinding

class HomeBaseFragment : BaseFragment<FragmentHomeBaseBinding>(R.layout.fragment_home_base) {

    override fun savedatainit() {
        // 초기 화면
        childFragmentManager
            .beginTransaction()
            .replace(R.id.home_base_layout, HomeFragment(), "home")
            .commitAllowingStateLoss()
    }

    override fun init() {
    }
}