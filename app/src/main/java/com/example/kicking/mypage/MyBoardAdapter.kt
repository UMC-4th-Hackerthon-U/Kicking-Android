package com.example.kicking

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class MyBoardAdapter (val boardList: ArrayList<Boards>): RecyclerView.Adapter<MyBoardAdapter.CustomViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_board, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                var curPos : Int = adapterPosition
                var board : Boards = boardList.get(curPos)
                Toast.makeText(parent.context, "제목: ${board.title}", Toast.LENGTH_SHORT).show()

            }
        }    }

    override fun onBindViewHolder(holder: MyBoardAdapter.CustomViewHolder, position: Int) {
        holder.picture1.setImageResource(boardList.get(position).picture1)
        holder.picture2.setImageResource(boardList.get(position).picture2)
        holder.picture3.setImageResource(boardList.get(position).picture3)
        holder.picture4.setImageResource(boardList.get(position).picture4)
        holder.profile.setImageResource(boardList.get(position).profile)
        holder.title.text = boardList.get(position).title.toString()
    }

    override fun getItemCount(): Int {
        return boardList.size
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val picture1 = itemView.findViewById<ImageView>(R.id.iv_jjal1)
        val picture2 = itemView.findViewById<ImageView>(R.id.iv_jjal2)
        val picture3 = itemView.findViewById<ImageView>(R.id.iv_jjal3)
        val picture4 = itemView.findViewById<ImageView>(R.id.iv_jjal4)
        val profile = itemView.findViewById<ImageView>(R.id.iv_profile) // 프로필사진
        val title = itemView.findViewById<TextView>(R.id.tv_title) // 제목
    }
}