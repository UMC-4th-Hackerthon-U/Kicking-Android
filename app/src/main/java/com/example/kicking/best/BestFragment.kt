package com.example.kicking.best

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kicking.R
import com.example.kicking.databinding.FragmentBestBinding

class BestFragment : Fragment() {
    lateinit var binding : FragmentBestBinding
    lateinit var kingAdapter: BestKingViewPagerAdapter
    lateinit var boardAdapter: BestBoardViewPagerAdapter
    lateinit var tipAdapter: BestTipViewPagerAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBestBinding.inflate(inflater, container, false)
        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.black);
        setBestRV()

        return binding.root
    }
    private fun setBestRV(){
        var kingList = arrayListOf<BestKingContents>(
            BestKingContents(R.drawable.basic_profile_01, "집에보내줘", "물 마시다가 그대로 뱉어본 적 있음? 진짜 예나 선정이 딸이에요 그거였음ㅇㅇ", false, 500),
            BestKingContents(R.drawable.basic_profile_02, "kiking1", "고객 이름이 \"영어\"였는데 순간 뇌정지와서 이름이 알파벳이세요? 이럼...", true, 100),
            BestKingContents(R.drawable.basic_profile_03, "중독자", "이거 진짜 꿀팁인데 면접할 때 떨리잖아? 일단 한 사람 찍어 그리고나서 마음속으로 어쩌고 저쩌고 근데 점점", false, 100),
            BestKingContents(R.drawable.basic_profile_01, "머머리", "인턴 때 외국거래처에서 Please make a copy 이랬는데 잘못듣고 커피타감ㅋ", false, 100),
        )

        var boardList = arrayListOf<BestBoardContents>(
            BestBoardContents(R.drawable.basic_profile_01, "board", "물 마시다가 그대로 뱉어본 적 있음? 진짜 예나 선정이 딸이에요 그거였음ㅇㅇ", false, 100),
            BestBoardContents(R.drawable.basic_profile_02, "kiking1", "고객 이름이 \"영어\"였는데 순간 뇌정지와서 이름이 알파벳이세요? 이럼...", true, 0),
            BestBoardContents(R.drawable.basic_profile_03, "도파민 중독자", "이거 진짜 꿀팁인데 면접할 때 떨리잖아? 일단 한 사람 찍어 그리고나서 마음속으로 어쩌고 저쩌고 근데 점점", false, 100),
            BestBoardContents(R.drawable.basic_profile_01, "머머리", "인턴 때 외국거래처에서 Please make a copy 이랬는데 잘못듣고 커피타감ㅋ", false, 10),
        )

        var tipList = arrayListOf<BestTipContents>(
            BestTipContents(R.drawable.basic_profile_01, "tip", "물 마시다가 그대로 뱉어본 적 있음? 진짜 예나 선정이 딸이에요 그거였음ㅇㅇ", false, 100),
            BestTipContents(R.drawable.basic_profile_02, "kiking1", "고객 이름이 \"영어\"였는데 순간 뇌정지와서 이름이 알파벳이세요? 이럼...", true, 100),
            BestTipContents(R.drawable.basic_profile_03, "도파민 중독자", "이거 진짜 꿀팁인데 면접할 때 떨리잖아? 일단 한 사람 찍어 그리고나서 마음속으로 어쩌고 저쩌고 근데 점점", false, 100),
            BestTipContents(R.drawable.basic_profile_01, "머머리", "인턴 때 외국거래처에서 Please make a copy 이랬는데 잘못듣고 커피타감ㅋ", false, 100),
        )
        kingAdapter = BestKingViewPagerAdapter(kingList)
        binding.bestKingRv.adapter = kingAdapter
        binding.bestKingRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        boardAdapter = BestBoardViewPagerAdapter(boardList)
        binding.bestBoardRv.adapter = kingAdapter
        binding.bestBoardRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        tipAdapter = BestTipViewPagerAdapter(tipList)
        binding.bestTipRv.adapter = tipAdapter
        binding.bestTipRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        activity?.window?.statusBarColor = ContextCompat.getColor(requireContext(), R.color.white);
    }
}