package com.example.kicking.best

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kicking.databinding.ItemKingContentBinding

class BestKingViewPagerAdapter(private val kingList: ArrayList<BestContents>) : RecyclerView.Adapter<BestKingViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(private val binding: ItemKingContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contents: BestContents) {
            binding.kingProfileIv.setImageResource(contents.profileImg)
            binding.kingNicknameTv.text = contents.nickname
            binding.kingContentsTv.text = contents.contents
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding: ItemKingContentBinding = ItemKingContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(kingList[position])
    }

    override fun getItemCount(): Int  = kingList.size

}