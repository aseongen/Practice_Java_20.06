package net.abc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import net.abc.vo.BoardVo;

public class BoardDAOImp1 {//오라클 jdbc 코드

	String driver="oracle.jdbc.OracleDriver";//oracle.jdbc는 패키지명,OracleDriver는 오라클
	//jdbc 드라이버 클래스명
	String url="jdbc:oracle:thin:@localhost:1521:xe";//오라클 접속주소,1521은 포트번호,
	//xe는디비명
	String user="week";//오라클 접속사용자
	String password="week";//사용자 비번
	
	Connection con=null;//데이터베이스 연결 참조변수
	Statement st=null;//쿼리문 수행 참조변수 1, 속도가 느리고 요즘은 잘 사용안함.
	PreparedStatement pt=null;//쿼리문 수행 참조변수 2, 쿼리문을 미리 컴파일하여 속도가 빠르다.
	ResultSet rs=null;//검색 결과 레코드를 저장할 rs
	String sql=null;//쿼리문 저장변수
//-------------------------------------------------------------------------------------	
//게시물 저장
	public void insertBoard(BoardVo b) {
      try {
    	Class.forName(driver);//jdbc드라이버 클래스 로드
    	con=DriverManager.getConnection(url, user, password);
    	//오라클 연결 객체 con생성
    	sql="insert into boardT values(b_no_seq.nextval,?,?,?,sysdate)";
    	//sysdate는 오라클 날짜함수
    	pt=con.prepareStatement(sql);//쿼리문을 미리 컴파일하여 실행객체 pt생성
    	pt.setString(1,b.getB_name());//쿼리문 첫번째 ?에 문자열로 작성자 저장
    	pt.setString(2,b.getB_title());//쿼리문 두번째 ?에 문자열로 제목 저장
    	pt.setString(3,b.getB_cont());//쿼리문 세번째 ?에 문자열로 내용저장
    	pt.executeUpdate();//저장쿼리문 수행후 저장 성공한 레코드 행의 개수를 반환
      }catch(Exception e) {e.printStackTrace();}
      finally {
    	  try {
    		  if(pt != null ) pt.close();
    		  if(con != null) con.close();
    	  }catch(Exception e) {e.printStackTrace();}
      }
	}//insertBoard()
	
//-------------------------------------------------------------------------------------
//게시물 목록
	public List<BoardVo> getBoardList(){
		List<BoardVo> blist=new ArrayList<>();//업캐스팅하면서 제네릭 타입 blist생성
		try {
			con=DriverManager.getConnection(url, user, password);
			st=con.createStatement();//쿼리문 수행 st생성
			sql="select * from boardT order by b_no desc";//번호를 기준으로 내림차순 정렬
			rs=st.executeQuery(sql);
			while(rs.next()) {//검색되는 레코드행이 복수개이면 while 반복문 사용,한개이면 if조건문
				BoardVo b=new BoardVo();
				b.setB_no(rs.getInt("b_no"));
				b.setB_name(rs.getString("b_name"));
				b.setB_title(rs.getString("b_title"));
				b.setB_cont(rs.getString("b_count"));
				b.setB_date(rs.getString("b_date"));
				blist.add(b);//컬렉션에 추가
			}
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
              if(rs != null) rs.close();
              if(st != null) st.close();
              if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}
		return blist;
	}//getBoardList()
	
//-------------------------------------------------------------------------------------	
//오라클로 부터 번호검색
	public BoardVo getFindNo(int no) {
		BoardVo b=null;
		try {
           con=DriverManager.getConnection(url,user,password);
           sql="select b_no from boardT where b_no=?";//번호를 기준으로 오라클로 부터 번호검색
           pt=con.prepareStatement(sql);//쿼리문을 미리 컴파일하여 수행객체 pt생성
           pt.setInt(1,no);
           rs=pt.executeQuery();//검색번호를 rs에 저장
           if(rs.next()) {
        	   b=new BoardVo();
        	   b.setB_no(rs.getInt(1));
           }
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally
		return b;
	}//getFindNo()
	
//-------------------------------------------------------------------------------------	
	//게시물수정
	public int updateBoard(BoardVo eb) {
		int re=-1;//수정 실패시 반환값
		try {
          con=DriverManager.getConnection(url, user, password);
          sql="update boardT set b_name=?,b_title=?,b_count=? where b_no=?";//번호를 기준
          //으로 이름,제목,내용을 수정
          pt=con.prepareStatement(sql);
          pt.setString(1,eb.getB_name());//쿼리문(sql)의 첫번째 물음표에 문자열로 수정할 작성자를
          //저장
          pt.setString(2,eb.getB_title());
          pt.setString(3,eb.getB_cont());
          pt.setInt(4,eb.getB_no());
          re=pt.executeUpdate();//수정 쿼리문 수행후 수정 성공한 레코드행의 개수를 반환
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally 
		return re;
	}//updateBoard()
	
//-------------------------------------------------------------------------------------	
	//게시물 삭제
	public int delBoard (int no) {
		int re=-1; //삭제 실패시 반환값
		try {
		 con = DriverManager.getConnection(url,user,password);
		 sql = "delete from boardT where b_no=?";// 번호를 기준으로 삭제
		 pt = con.prepareStatement(sql);
		 pt.setInt(1, no);
		 re=pt.executeUpdate();//삭제 성공한 레코드 행의 개수 반환
			
		}catch(Exception e) {e.printStackTrace();}
		finally {
			try {
				if(pt != null) pt.close();
				if(con != null) con.close();
			}catch(Exception e) {e.printStackTrace();}
		}//finally 
		return re;
	}//delBoard()
}//class
