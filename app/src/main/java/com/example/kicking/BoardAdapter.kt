package com.example.kicking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class BoardAdapter (val boardList: ArrayList<Boards>): RecyclerView.Adapter<BoardAdapter.CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_board, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                var curPos : Int = adapterPosition
                var board : Boards = boardList.get(curPos)
                Toast.makeText(parent.context, "제목: ${board.title}", Toast.LENGTH_SHORT).show()

            }
        }    }

    override fun onBindViewHolder(holder: BoardAdapter.CustomViewHolder, position: Int) {
        holder.profile.setImageResource(boardList.get(position).profile)
        holder.title.text = boardList.get(position).title.toString()
    }

    override fun getItemCount(): Int {
        return boardList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val profile = itemView.findViewById<ImageView>(R.id.iv_profile) // 프로필사진
        val title = itemView.findViewById<TextView>(R.id.tv_title) // 제목
    }
}