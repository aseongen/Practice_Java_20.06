import java.util.List;

import net.abc.dao.BoardDAOImp1;
import net.abc.vo.BoardVo;

public class BoardList2 {
	public static void main(String[] args) {

		BoardDAOImp1 bdao = new BoardDAOImp1();
		List<BoardVo> blist = bdao.getBoardList();
		System.out.println("no \t title \t name \t cont \t date");
		System.out.println("------------------------------------");
		
		if((blist != null ) && (blist.size()>0)) {
			for(BoardVo b : blist) {
		      System.out.println(b.getB_no()+"\t"+b.getB_title()+"\t" + b.getB_name() +"\t" + b.getB_cont() + "\t" + b.getB_date());
			}//for
			
		}else {
			System.out.println("게시물 목록이 없습니다.");
		}//if else
		
	}//main 
}//class 


