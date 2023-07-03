package com.example.kicking.best

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kicking.R
import com.example.kicking.databinding.ItemBoardContentBinding
import com.example.kicking.databinding.ItemKingContentBinding

class BestBoardViewPagerAdapter(private val boardList: ArrayList<BestBoardContents>) : RecyclerView.Adapter<BestBoardViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemBoardContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contents: BestBoardContents) {
            binding.boardProfileIv.setImageResource(contents.profileImg)
            binding.boardNicknameTv.text = contents.nickname
            binding.boardContentsTv.text = contents.contents
            binding.boardBottomLikeIv.setOnClickListener {
                contents.isScraped = !contents.isScraped
                updateLikeImage(contents.isScraped)
            }

        }
        private fun updateLikeImage(isLiked: Boolean) {
            val likeImageResource = if (isLiked) {
                R.drawable.scrap_button_red
            } else {
                R.drawable.scrap_button_none
            }
            binding.boardBottomLikeIv.setImageResource(likeImageResource)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding: ItemBoardContentBinding = ItemBoardContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(boardList[position])
    }

    override fun getItemCount(): Int  = boardList.size

}