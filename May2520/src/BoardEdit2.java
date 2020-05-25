import java.util.Scanner;

import net.abc.dao.BoardDAOImp1;
import net.abc.vo.BoardVo;

public class BoardEdit2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("게시물 번호 입력 ->> ");
		int no = Integer.parseInt(sc.nextLine());

		BoardDAOImp1 bdao = new BoardDAOImp1();
		BoardVo dbNo = bdao.getFindNo(no);// 오라클로부터 번호값 검색

		if (dbNo != null) {

			System.out.println("검색된 번호값: " + dbNo.getB_no());
			System.out.print("수정할 이름>> ");
			String name = sc.nextLine();
			System.out.print("수정할 제목>>  ");
			String title = sc.nextLine();
			System.out.print("수정할 내용>> ");
			String cont = sc.nextLine();

			BoardVo eb = new BoardVo();
			eb.setB_no(no);
			eb.setB_name(name);
			eb.setB_title(title);
			eb.setB_cont(cont);
			int re = bdao.updateBoard(eb);// 게시물 수정

			if (re == 1) {
				System.out.println("수정 성공");
			}
		} else {
			System.out.println("검색번호가 없어서 수정 못함");
		} // if else

	}// main

}// class
