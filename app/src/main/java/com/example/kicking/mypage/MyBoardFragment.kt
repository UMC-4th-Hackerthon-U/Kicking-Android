import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kicking.BoardAdapter
import com.example.kicking.Boards
import com.example.kicking.R
import com.example.kicking.base.BaseFragment
import com.example.kicking.databinding.FragmentMyBoardBinding

class MyBoardFragment : BaseFragment<FragmentMyBoardBinding>(R.layout.fragment_my_board) {

    override fun init() {

        val boardList = arrayListOf(
            Boards(R.drawable.pic5, R.drawable.pic6, R.drawable.pic7, R.drawable.pic8, R.drawable.profile0, "잼민시절 킹받는 썰"),
            Boards(R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4, R.drawable.profile1,"꿀잼 흑역사 모음"),
            Boards(R.drawable.pic9, R.drawable.pic10, R.drawable.pic11, R.drawable.pic12, R.drawable.profile0,"킹받는 주사 ㅋㅋㅋㅋㅋㅋㅋ"),
//            Boards(R.drawable.pic2, "와 이거 퇴사 각인데 ..."),
//            Boards(R.drawable.pic3, "재밌으면 따봉눌러"),
//            Boards(R.drawable.pic4, "잊어버륄레......."),
        )
        binding.rvBoard.layoutManager = LinearLayoutManager(super.getActivity(), LinearLayoutManager.VERTICAL, false)
        binding.rvBoard.setHasFixedSize(true)

        binding.rvBoard.adapter = BoardAdapter(boardList)

    }


}