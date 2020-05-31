package com.naver.dao;

import java.util.Scanner;

import com.naver.vo.GuestVO;

public class GuestInsert {

	/*
	 * 문제) 1. com.naver.dao 패키지를 만들고 GuestDAOImp1.java 파일을 만들어 여기에 jdbc 코드를 한다. 
	 * 2. com.naver.vo 패키즈를 만들고 중간 데이터 저장 빈 클래스 GuestVO.JAVA 를 만든다.
	 *  3. 다음과 같은 tbl_guest 방명록 테이블을 만든다. 
	 *  컬럼명 자료형 크기 제약조건 
	 *  g_no number 38 primary key
	 *  g_name varchar2 50 not null 
	 *  g_title varchar2 200 not null 
	 *  g_pwd varchar2 20 not null
	 *  g_cont varchar2 40000 not null g_date date
	 * 
	 * 4. g_no_seq 라는 시퀀스를 생성해서 g_no 컬럼 레코드 값을 번호로 사용한다.
	 * 5. GuestInsert에서 스캐너를 사용해서방명록 저장 소스를 완성한다. 
	 * 6. 컬렉션 List <GuestVo> 제네릭 타입을 사용해서 GuestList.java. 
	 * 즉 방명록  목록보기 소스까지 완성한다.
	 * 
	 * 이것이 자바다 1권 파트 1~5까지 읽어보기
	 * 
	 */
	public static void main(String[] args) {

		//insert
		Scanner sc = new Scanner(System.in);
		GuestVO gv = new GuestVO();
		GuestDAOImp1 gdao = new GuestDAOImp1();

		System.out.println("tbl_guest 테이블에 레코드 저장하기");
		System.out.println("name을 입력하시오 ");
		String g_name = sc.nextLine();
		System.out.println("title을 입력하세요");
		String g_title = sc.nextLine();
		System.out.println("pwd를 입력하세요");
		String g_pwd = sc.nextLine();
		System.out.println("cont를 입력하세요");
		String g_cont = sc.nextLine();
		
		gv.setG_name(g_name); gv.setG_title(g_title); gv.setG_pwd(g_pwd); gv.setG_cont(g_cont);
		
		gdao.guestInsert(gv);
		
	}

}// class
