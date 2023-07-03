package com.example.kicking.home

import android.util.Log
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kicking.R
import com.example.kicking.base.BaseFragment
import com.example.kicking.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private lateinit var homeStoryadapter: HomeStroyAdapter
    private lateinit var homeFeedadapter: HomeFeedAdapter
    override fun init() {
        initAppbar(binding.homeToolbar, "홈", false, true)


        val dataList = listOf(
            StoryDto(R.drawable.cardview01),
            StoryDto(R.drawable.cardview02),
            StoryDto(R.drawable.cardview03),
            StoryDto(R.drawable.cardview01),
            StoryDto(R.drawable.cardview02),
            StoryDto(R.drawable.cardview03)
        )

        val dataLists = listOf(
           FeedDto(R.drawable.profile01,
                   R.drawable.feed01,
               "내일도 술 먹으면 내가 진짜 개",
           "5분전",
               "어제 술 개많이 먹고 레전드 흑역사 하나찍음ㅠㅋㅠㅠ진짜 어이없고 쪽팔린데 개웃김ㅋㅋㅋ큨",
           "220개","89개","158개"),
           FeedDto(R.drawable.profile02,
               R.drawable.feed01,
               "이불키킹러버",
               "23분전",
               "수업시간에 자다가 우렁차게 방귀뀌면서 일어남ㅠㅠ큐큨",
               "199개","56개","38개")

        )

        // 리사이클러뷰 초기화
        val recyclerView = binding.homeRecyclerviewStory
        val spanCount = 1 // 열의 개수를 설정하거나 원하는 값으로 변경하세요
        val layoutManager = GridLayoutManager(context, spanCount, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager




        recyclerView.setOnClickListener(){
            Log.d("1","1")
        }


        homeStoryadapter= HomeStroyAdapter(dataList,this)
        recyclerView.adapter = homeStoryadapter


        val recyclerViews = binding.homeRecyclerviewFeed
        val gridsLayoutManager = GridLayoutManager(requireContext(), 1)
        recyclerViews.layoutManager = gridsLayoutManager
        homeFeedadapter=HomeFeedAdapter(dataLists,this)
        recyclerViews.adapter=homeFeedadapter

        binding.fab.setOnClickListener {
            val postFragment = PostFragment() // 전환할 프래그먼트 인스턴스 생성
            val fragmentTransaction = parentFragmentManager.beginTransaction()
            fragmentTransaction.add(R.id.home_layout, postFragment, "post")
            fragmentTransaction.addToBackStack(null)
            fragmentTransaction.commitAllowingStateLoss()
            Log.d("clicked","change")
        }




    }


}