package com.example.kicking.best

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kicking.R
import com.example.kicking.databinding.ItemKingContentBinding
import com.example.kicking.databinding.ItemTipContentBinding

class BestTipViewPagerAdapter(private val tipList: ArrayList<BestTipContents>) : RecyclerView.Adapter<BestTipViewPagerAdapter.ViewHolder>() {

    inner class ViewHolder(val binding: ItemTipContentBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(contents: BestTipContents) {
            binding.tipProfileIv.setImageResource(contents.profileImg)
            binding.tipNicknameTv.text = contents.nickname
            binding.tipContentsTv.text = contents.contents
            binding.tipBottomLikeIv.setOnClickListener {
                contents.isTip = !contents.isTip
                updateLikeImage(contents.isTip)
            }

        }
        private fun updateLikeImage(isLiked: Boolean) {
            val likeImageResource = if (isLiked) {
                R.drawable.talk_button_red
            } else {
                R.drawable.talk_button_none
            }
            binding.tipBottomLikeIv.setImageResource(likeImageResource)
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val binding: ItemTipContentBinding = ItemTipContentBinding.inflate(LayoutInflater.from(parent.context), parent, false)

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(
        holder: ViewHolder,
        position: Int
    ) {
        holder.bind(tipList[position])
    }

    override fun getItemCount(): Int  = tipList.size

}