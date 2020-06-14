package com.naver.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.util.concurrent.Executors;

import com.naver.vo.JoinVO;

public class JoinDAO {

	String driver = "oracle.jdbc.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String user = "week";
	String psw = "week";

	Connection con = null;
	PreparedStatement pt = null;
	ResultSet rs = null;
	String sql = null;

//---아이디 확인--------------------------------------------
	public boolean idSearch(String id) {
		boolean bool = false;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);
			sql = "select *from gbl_member where g_id=?";
			pt = con.prepareStatement(sql);

			// id 일치하는지 찾는중, pt는 값을 넣어주기만 하고, 실행은 하지만 정확한 값을 출력하지는 않는다.
			pt.setString(1, id);
			int re = pt.executeUpdate();
			
			// 성공하면 1 반환
			if (re == 1) {
				bool = true;
				return bool; // true
			} // if
		} catch (Exception e) {
			e.printStackTrace();
		}//try~catch
		return bool; // false
	}// idSearch
//--회원가입------------------------------------------------
	public void memberShip(JoinVO jv) {

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);

			if (idSearch(jv.getG_id()) == true) {
				System.out.println("같은 아이디가 존재합니다.");
				return;
			} // if

			sql = "insert into gbl_member values(?,?,?,sysdate)";
			pt = con.prepareStatement(sql);
			pt.setString(1, jv.getG_id());
			pt.setString(2, jv.getG_name());
			pt.setString(3, jv.getG_pwd());

			int re = pt.executeUpdate();
			if(re==1) {
				System.out.println("회원가입 성공");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (pt != null)
					pt.close();
				if (con != null)
					con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		} // finally
	}// memberShip
//-패스워드 정합성----------------------------------------
	public boolean pwdSearch(String id ,String pwd) {
		boolean bool = false;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, psw);
			sql = "select *from gbl_member where g_id=? and g_pwd=?";
			pt = con.prepareStatement(sql);

			// id 일치하는지 찾는중, pt는 값을 넣어주기만 하고, 실행은 하지만 정확한 값을 출력하지는 않는다.
			pt.setString(1, id);
			pt.setString(2, pwd);

			int re = pt.executeUpdate();
			// 성공하면 1 반환
			if (re == 1) {
				bool = true;
				return bool; // true
			} // if
		} catch (Exception e) {
			e.printStackTrace();
		}//try~catch
		return bool; // false
	}// pwdSearch
//---로그인-----------------------------------------------------
	public void login(JoinVO jv) {//로그인
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,psw);
			
			if(pwdSearch(jv.getG_id(),jv.getG_pwd())) {
				System.out.println("로그인 완료 되었습니다. ");
				
			}else {
				System.out.println("아이디 또는 비밀번호가 일치하지 않습니다");
			}//if else 
			
	}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(con != null) con.close();
			}catch(Exception e ) {e.printStackTrace();} //try~catch
		}//finally 
	}// login
//-비번 변경 ------------------------------------------------------------
	public void updatePWD(String pwd) {
		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,psw);
			sql = "update gbl_member set g_pwd where g_pwd=?";
			pt = con.prepareStatement(sql);
			
			
			int re = pt.executeUpdate();
			// 성공하면 1 반환
			if (re == 1) {
				System.out.println("성공");
			} // if
			
			
	}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(con != null) con.close();
				if(pt != null)pt.close();
				
			}catch(Exception e) {e.printStackTrace();}
		}
	}// updatePWD b 

	
//--------------------------------------------------------------------	
	public void memberDel(JoinVO jv) {//계정 삭제
		int re =-1;
		
		try {
			if(pwdSearch(jv.getG_id(),jv.getG_pwd())) {
			Class.forName(driver);
			con = DriverManager.getConnection(url,user,psw);
			sql = "delete from gbl_member where g_id=?";
			pt =con.prepareStatement(sql);
			pt.setString(1,jv.getG_id());
			
			re =pt.executeUpdate();
			if(re==1) {
				System.out.println("성공하셨습니다.");
			}//inner if 
			}else {
				System.out.println("아이디 또는 패스워드가 일치하지 않습니다.");
			}
	      } catch(Exception e) {e.printStackTrace();}
		   finally {
			   try {
				   
			   } catch(Exception e) {e.printStackTrace();}
		   }
		
	    }// memberDEl

	
//--------------------------------------------------------------------
	public void memberInfo(JoinVO jv) { //회원 정보 출력
		
		try {
			if(pwdSearch(jv.getG_id(),jv.getG_pwd())) {
			con =DriverManager.getConnection(url,user,psw);
			sql="select * from gbl_member where g_id=? and g_pwd=?";
			pt=con.prepareStatement(sql);
			pt.setString(1, jv.getG_id());
			pt.setString(2, jv.getG_pwd());
			
			rs= pt.executeQuery();
			
			
			if(rs.next()) {
				System.out.println();
				System.out.printf("%s\t %s\t %s\t %s\n",
						rs.getString("g_id"),
						rs.getString("g_name"),
						rs.getString("g_pwd"),
						rs.getString("g_date"));
                
			} //rs.next()
        }//if pwdSearch
	}catch(Exception e) { e.printStackTrace();}
		finally {
			try {
				if(con != null) con.close();
				if(pt != null)pt.close();
			}catch(Exception e) {e.printStackTrace();}
		}
}// memberInfo
}// class
