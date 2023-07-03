import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.kicking.BoardFragment

import com.example.kicking.MycontentFragment

class MypageVPAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> MycontentFragment()
            1 -> MyBoardFragment()
            else -> MycontentFragment()
        }
    }
}