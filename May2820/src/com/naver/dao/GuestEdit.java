package com.naver.dao;

import java.util.List;
import java.util.Scanner;

import com.naver.vo.GuestVO;

public class GuestEdit {
	public static void main(String[] args) {

/* 문제 )
 * GuestDAOImi기준으로 방명록 소스를 수정한다.
 * 그 전에 오라클 DB로 부터 방명록 번호를 검색하는 메서드부터 생성해라
 * 
 * 번호값이 있는 경우만 수정하고 해당 번호가 오라클 디비로 부터 검색되지 않을 때는 
 * 유효성 검증 경고 메시지를 출력하게 하라
 *  GuestEdit.Java 소스를 코드 완성 한다. 
 *  
 *  1권 1,2,3,4,5 모의면접 
 */
		Scanner sc = new Scanner(System.in);
		System.out.println("게시물 번호 입력>> ");
		
		
		int no = Integer.parseInt(sc.nextLine());
		
		GuestDAOImp1 gdao = new GuestDAOImp1();
		GuestVO guNo = gdao.getFindNo(no);

		
		if((guNo == null)) {
			System.out.println("번호가 일치하지 않습니다.");
		} if (guNo != null) {
			System.out.println("검색된 번호값: " + guNo.getG_no());
			System.out.println("수정할 이름>> ");
			String name =sc.nextLine();
			System.out.print("수정할 제목>>  ");
			String title = sc.nextLine();
			System.out.print("수정할 내용>> ");
			String cont = sc.nextLine();
			
			GuestVO gu = new GuestVO();
			gu.setG_no(no);
			gu.setG_name(name);
			gu.setG_title(title);
			gu.setG_cont(cont);
			
			int re = gdao.updateGuest(gu);
			if(re==1) {
				System.out.println("수정 성공");
			}
		}//if else 


	}//main
}//class 
