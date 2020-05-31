package com.naver.dao;

import java.util.List;

import com.naver.vo.GuestVO;



public class GuestList {
	public static void main(String[] args) {


		GuestDAOImp1 gdao = new GuestDAOImp1();
		List<GuestVO> blist = gdao.getGuestList();
		System.out.println("no \t name \t title \t pwd \t cont");
		System.out.println("-----------------------------------------");
	
		if((blist != null ) && (blist.size()>0)) {
			for(GuestVO b : blist) {
		      System.out.println(b.getG_no()+"\t"+b.getG_name()+"\t" + b.getG_title() +"\t" + b.getG_pwd() + "\t" + b.getG_cont());
			}//for
			
		} else {
			System.out.println("게시물 목록이 없습니다.");
	
	}//if~else

  }//main
}//class
