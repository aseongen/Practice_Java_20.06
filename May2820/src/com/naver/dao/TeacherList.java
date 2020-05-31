package com.naver.dao;

import java.util.List;
import com.naver.vo.GuestVO;
import com.naver.vo.TeacherVO;

public class TeacherList {
	public static void main(String[] args) {
		TeacherDAOImpl gdao = new TeacherDAOImpl();
		List<TeacherVO> glist = gdao.getTeacherList();
		System.out.println("no \t name \t title \t pwd \t cont");
		System.out.println("-----------------------------------------");
	
		if((glist != null ) && (glist.size()>0)) {
			for(TeacherVO g : glist) {
		      System.out.println(g.getT_no()+"\t"+g.getT_name()+"\t" + g.getT_title() +"\t" + g.getT_pwd() + "\t" + g.getT_cont());
			}//for
			
		} else {
			System.out.println("게시물 목록이 없습니다.");
	
	}//if~else
	}
}
