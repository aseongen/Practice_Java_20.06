package com.naver.dao;

import java.util.Scanner;

import com.naver.vo.TeacherVO;

public class TeacherInsert {
	public static void main(String[] args) {
		
		
		//insert
		Scanner sc = new Scanner(System.in);
		TeacherVO tv= new TeacherVO();

		System.out.println("tbl_Teacher 테이블에 레코드 저장하기");
		System.out.println("name을 입력하시오 ");
		String t_name = sc.nextLine();
		System.out.println("title을 입력하세요");
		String t_title = sc.nextLine();
		System.out.println("pwd를 입력하세요");
		String t_pwd = sc.nextLine();
		System.out.println("cont를 입력하세요");
		String t_cont = sc.nextLine();
		
		tv.setT_name(t_name); tv.setT_title(t_title); tv.setT_pwd(t_pwd); tv.setT_cont(t_cont);
		
		TeacherDAOImpl td = new TeacherDAOImpl();
		int re = td.insertTe(tv);
		if(re==1) {
			System.out.println(" 자료저장 성공");
		}
		
	}

}
