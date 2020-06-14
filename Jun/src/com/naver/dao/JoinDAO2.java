package com.naver.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.naver.vo.JoinVO2;

public class JoinDAO2 {

	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "week";
	String psw = "week";

	Connection con2 = null;
	String sql2 = null;
	PreparedStatement prest = null;
	ResultSet rs2 = null;

//-아이디 확인-------------------------------
	public boolean checkID(String id) {
		boolean bool = false;
		try {
			Class.forName(driver);
			con2 = DriverManager.getConnection(url, user, psw);
			sql2 = "select * from gbl_member2 where g2_id=? ";
			prest = con2.prepareStatement(sql2);

			prest.setString(1, id);

			int re = prest.executeUpdate();

			if (re == 1) {
				bool = true;
				return bool;
			} // if

		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool; // false

	}

//아이디, 비밀번호 확인--------------------------------------
	public boolean pwdSearch(String id, String pwd) {
		boolean bool = false;
		try {
			Class.forName(driver);
			con2 = DriverManager.getConnection(url, user, psw);
			sql2 = "select * from gbl_member2 where g2_id=? and g2_pwd=?";

			prest = con2.prepareStatement(sql2);

			prest.setString(1, id);
			prest.setString(2, pwd);

			int re = prest.executeUpdate();
			if (re == 1) {
				bool = true;
				return bool;

			} // if
		} catch (Exception e) {
			e.printStackTrace();
		}
		return bool;
	}// pwdSearch

//회원가입---------------------------
	public void memberJoin(JoinVO2 jv2) {

		try {
           Class.forName(driver);
           con2 = DriverManager.getConnection(url,user,psw);
            sql2 = "insert into gbl2_member values(?,?,?,sysdate)";
            prest.setString(1, jv2.getG2_id());
            prest.setString(2, jv2.getG2_name());
            prest.setString(3, jv2.getG2_pwd());
            
            int re = prest.executeUpdate();
            if(re==1) {
            	System.out.println("회원가입 성공");
            }
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (prest != null)	prest.close();
				if (con2 != null) con2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
//로그인----------------------------

	public void memberJoin2(JoinVO2 jv2) {

		try {
 
			Class.forName(driver);
			con2 =DriverManager.getConnection(url,user,psw);
			if(pwdSearch(jv2.getG2_id(),jv2.getG2_pwd())) {
				System.out.println("로그인 완료 되었습니다.");
			}else {
				System.out.println("아이디 또는 비밀번호 일치하지 않습니다.");
			}//if else 
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(con2 != null) con2.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}//memberJoin
//---------------------------------------s	
	
	
	
}//class
