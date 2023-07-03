package com.example.kicking.home

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.kicking.R
import com.example.kicking.databinding.HomestorycardviewBinding


class HomeStroyAdapter(private val dataList: List<StoryDto>, private val fragment: Fragment) :
    RecyclerView.Adapter<HomeStroyAdapter.ViewHolder>() {
    private var clickListener: OnItemClickListner? = null


    interface OnItemClickListner {
        fun onItemClick(view: View, position: Int)
    }

    //리스너 인터페이스 객체를 전달하는 메서드 선언
    fun setOnItemclickListner(onItemClickListner: OnItemClickListner) {
        itemClickListner = onItemClickListner
    }

    //전달된 객체를 저장할 변수 정의
    private lateinit var itemClickListner: OnItemClickListner
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            HomestorycardviewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun getItem(position: Int): StoryDto {
        return dataList[position]
    }



    inner class ViewHolder(private val binding: HomestorycardviewBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            binding.root.setOnClickListener(this)
        }

        fun bind(story: StoryDto) {

            binding.imageview.setImageResource(story.Story_id)
        }
        override fun onClick(view: View) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                //clickListener?.onItemClick(position)
                Log.d("clicked", position.toString())

             }

        }

        }
    }
