package com.naver.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.naver.vo.GuestVO;

public class GuestDAOImp1 {
	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "week";
	String psw = "week";

	Connection con = null;
	PreparedStatement pt =null;
	ResultSet rs = null;
	String sql = null;
//게시물 저장 -------------------------------------------------------
	public void guestInsert(GuestVO gv) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);
			sql ="insert into tbl_guest values(g_no_seq.nextval,?,?,?,?,sysdate)";
			pt=con.prepareStatement(sql);
			pt.setString(1, gv.getG_name());
			pt.setString(2, gv.getG_title());
			pt.setString(3, gv.getG_pwd());
			pt.setString(4, gv.getG_cont());
			
			int rn = pt.executeUpdate();
			if(rn == 1) {
				System.out.println("저장 성공");
			}
		} catch (Exception e) {e.printStackTrace();} 
		finally {
			try {
				if (pt != null)	pt.close();
				if (con != null)con.close();
			} catch (Exception e) {	e.printStackTrace();}
		} // finally
	}// guestInsert
//---게시물 목록--------------------------------------------------
	public List<GuestVO> getGuestList(){
		List<GuestVO> blist = new ArrayList<>();
		try {
			con=DriverManager.getConnection(url, user, psw);
			sql = "select * from tbl_guest order by g_no desc";
			pt = con.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				GuestVO gv = new GuestVO();
				gv.setG_no(rs.getInt("g_no"));
				gv.setG_name(rs.getString("g_name"));
				gv.setG_title(rs.getString("g_title"));
				gv.setG_pwd(rs.getString("g_pwd"));
				gv.setG_cont(rs.getString("g_cont"));
				blist.add(gv);
			}//while
			
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
		return blist;
	}//getGuestList
	
//-게시물 수정 ----------------------------------------------------
	public int updateGuest (GuestVO gv) {
		int re =-1;
	     //제목,내용,작성자
		try {
			con = DriverManager.getConnection(url,user,psw);
			sql = "update tbl_guest set g_name=?, g_title=?, g_cont=? where g_no=?";

			pt=con.prepareStatement(sql);
			pt.setString(1, gv.getG_name());
			pt.setString(2, gv.getG_title());
			pt.setString(3, gv.getG_cont());
			pt.setInt(4, gv.getG_no());
			
			int rn = pt.executeUpdate();
			if(rn == 1) {
				System.out.println("저장 성공");
			}
		}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) { e.printStackTrace();}
		}//finally
		return re;
	}//updateGuest
	
//-게시물 번호검색---------------------------------------------------
	
	public GuestVO getFindNo(int no) {
		GuestVO g=null;
	
		try {
			con=DriverManager.getConnection(url,user,psw);
			sql="select g_no from tbl_guest where g_no=?";
			pt = con.prepareStatement(sql);
			pt.setInt(1, no);
			rs=pt.executeQuery();
			if(rs.next()) {
				g=new GuestVO();
				g.setG_no(rs.getInt(1));
			}
		}catch(Exception e) { e.printStackTrace();}
		
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) { e.printStackTrace();}
		}//finally
		return g;
		
	}//getFindNo
	
	
}
