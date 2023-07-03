package com.example.kicking.best

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kicking.R
import com.example.kicking.databinding.ItemKingContentBinding

class BestKingViewPagerAdapter(private val kingList: ArrayList<BestKingContents>) : RecyclerView.Adapter<BestKingViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemKingContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contents: BestKingContents) {
            binding.kingProfileIv.setImageResource(contents.profileImg)
            binding.kingNicknameTv.text = contents.nickname
            binding.kingContentsTv.text = contents.contents
            binding.kingBottomLikeIv.setOnClickListener {
                contents.isLiked = !contents.isLiked
                updateLikeImage(contents.isLiked)
            }

        }
        private fun updateLikeImage(isLiked: Boolean) {
            val likeImageResource = if (isLiked) {
                R.drawable.k_button_red
            } else {
                R.drawable.k_button_none
            }
            binding.kingBottomLikeIv.setImageResource(likeImageResource)
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