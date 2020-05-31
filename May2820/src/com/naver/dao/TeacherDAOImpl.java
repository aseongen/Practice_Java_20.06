package com.naver.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.naver.vo.GuestVO;
import com.naver.vo.TeacherVO;



public class TeacherDAOImpl {
	


		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
	    String user = "week";
	    String pwd = "week";
	    
	    Connection con = null;//DB 연결 참조변수
	    PreparedStatement pt = null; //쿼리문 수행 참조변수
	    ResultSet rs = null; //검색 결과 자료 저장 참조변수
	    String sql = null; //쿼리문 저장 변수
	    
	    public int insertTe(TeacherVO T) {
	    	int re = -1;
	    	try {
	    		Class.forName(driver);
	    		con =DriverManager.getConnection(url, user, pwd);
	    		sql ="insert into tbl_guest2 values(t_no_seq2.nextval,?,?,?,?,sysdate)";
	    	    pt = con.prepareStatement(sql);
	    	    
	    	    pt.setString(1, T.getT_name()); pt.setString(2, T.getT_title()); 
	    	    pt.setString(3, T.getT_pwd()); pt.setString(4, T.getT_cont());
	    	   
	    	    int rn = pt.executeUpdate();
				if(rn == 1) {
					System.out.println("저장 성공");
				}
	    	}catch(Exception e) { e.printStackTrace();}
	    	finally {
	    		try {
	    			//만들어진 역순으로 작성
	    			if(rs != null) rs.close();
	    			if(pt != null) pt.close();
	    			if(con != null) con.close();
	    		}catch(Exception e) { e.printStackTrace();}
	    	} 
	    	return re;
	    }//insertTe
//--------------------------------------------------------------------------------------------	    
	    public List<TeacherVO> getTeacherList(){
			List<TeacherVO> glist = new ArrayList<>();
	
			try {
				con = DriverManager.getConnection(url,user,pwd);
				sql = "select * from tbl_guest2 order by T_no desc";
				pt = con.prepareStatement(sql);
				rs = pt.executeQuery();
				while(rs.next()) {
					//next ()는 검색된 다음 레코드 행이 존재하면 참
					TeacherVO tv = new TeacherVO();
					tv.setT_no(rs.getInt("T_no"));
					tv.setT_name(rs.getString("T_name"));
					tv.setT_name(rs.getString("T_title"));
					tv.setT_pwd(rs.getString("T_pwd"));
					tv.setT_cont(rs.getString("T_cont"));
					glist.add(tv);
					
				}//while
			}catch(Exception e ) { e.printStackTrace();}
			finally {
				
		   try {
				if(rs != null) rs.close();
				if(pt != null) pt.close();
				if(con != null)con.close();
			}catch(Exception e) { e.printStackTrace();}

	    }//finlally
			return glist;
	    }//List 

	
}
