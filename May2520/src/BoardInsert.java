import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class BoardInsert {

	public static void main(String[] args) {
		
		String driver = "oracle.jdbc.OracleDriver"; //oracle. jdbc 패키지명, OracleDriver는 오라클 jdbc드라이버 클래스명
	    String url="jdbc:oracle:thin:@localhost:1521:xe ";	 
	    //오라클 접속주소, localhost 는 모든 내 자신 컴퓨터를 가리키다.
	    //(127.0.0.1), 1521 은 오라클 연결 네트워크 포트번호, xe 는 데이터 베이스명 (디비명)
	    
	    String user = "week"; //오라클 접속 사용자
	    String pwd = "week";//사용자 비번 
		
	    Connection con = null; //오라클 연결 참조변수
	    Statement st = null; //쿼리문 수행 참조변수
	    String sql = null;// 쿼리문을 저장할 변수 
	    
	    Scanner sc = new Scanner (System.in);
	    
	    try {
	    	Class.forName(driver); //오라클 jdbc드라이버 클래스 로드 실행
	    	con=DriverManager.getConnection(url, user, pwd); //db연결 객체 생성 
	    	st= con.createStatement(); //쿼리문 수행 st 생성 
	    	
	    	System.out.println("boardT 테이블에 레코드 저장하기 >>");
	    	System.out.println("게시판 작성자 입력>> ");
	    	String name = sc.nextLine();
	    	System.out.println("게시판 제목 입력 >> ");
	    	String title = sc.nextLine();
	    	System.out.println("게시판 내용 입력 >> ");
	    	String cont = sc.nextLine();
	  
            sql = "insert into boardT values(b_no_seq.nextval,'"+name+"','" +title + " ',' "+cont+"',+sysdate)";
            int re = st.executeUpdate(sql); //저장쿼리문 성공시 성공한 레코드 형의 개수 
            
             if (re ==1) {
            	 System.out.println("레코드 저장 성공 ! ");
             }//if 
	    	
	    }catch (Exception e) { e.printStackTrace(); }
	    
	    // 오라클 DB를 열어놨기 떄문에 반드시 닫아줘야 한다. 
	    finally {
	    	try {
	    		if(sc != null) sc.close();
	    		if(st != null) st.close();
	    		if(con != null) con.close();
	    	}catch (Exception e) { e.printStackTrace();}
	    	}//finally
	    
	    
	}//main
}//class 
