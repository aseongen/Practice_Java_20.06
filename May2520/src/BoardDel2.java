import java.util.Scanner;

import net.abc.dao.BoardDAOImp1;
import net.abc.vo.BoardVo;

public interface BoardDel2 {
	public static void main(String[] args) {


	Scanner sc = new Scanner(System.in);
	System.out.print("게시물 번호 입력>> ");
	
	int no = Integer.parseInt(sc.nextLine());
	BoardDAOImp1 bdao = new BoardDAOImp1();
	BoardVo dbNo = bdao.getFindNo(no);
	
	if(bdao == null) {
		System.out.println("검색 번호가 없어서 삭제 못합니다!");
	}else {
		int re = bdao.delBoard(no);
		if(re==1) {
			System.out.println("삭제 성공 !");
		}//inner if
	}//outer if~else
	} //main
}//class
