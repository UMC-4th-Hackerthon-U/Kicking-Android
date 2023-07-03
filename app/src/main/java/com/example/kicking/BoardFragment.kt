package com.example.kicking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kicking.databinding.FragmentBoardBinding

class BoardFragment : Fragment() {
    private lateinit var binding : FragmentBoardBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBoardBinding.inflate(inflater, container, false)


        val boardList = arrayListOf(
            Boards(R.drawable.profile0, "꿀잼 흑역사 모음"),
            Boards(R.drawable.pic1, "잼민시절 킹받는 썰"),
            Boards(R.drawable.pic2, "와 이거 퇴사 각인데 ..."),
            Boards(R.drawable.pic3, "재밌으면 따봉눌러"),
            Boards(R.drawable.pic4, "잊어버륄레......."),
        )
        binding.rvBoard.layoutManager = LinearLayoutManager(super.getActivity(), LinearLayoutManager.VERTICAL, false)
        binding.rvBoard.setHasFixedSize(true)

        binding.rvBoard.adapter = BoardAdapter(boardList)
        return binding.root
    }

}