import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class BoardList {
	public static void main(String[] args) {


		String driver ="oracle.jdbc.driver.OracleDriver";//orracle.jdbc.driver는 패키지명
		//OracleDriver는 오라클 jdbc 드라이버 클래스명
		String url ="jdbc:oracle:thin:@localhost:1521:xe";//오라클 접속주소 localhost는 모든 내자신 컴퓨터 주소를 뜻함.(127.0.0.1) 1521은 오라클 연결 네트워크
		//포트번호 ,xe는 데이터베이스(DB) 명
		
		String user ="week";//오라클 접속사용자
		String pwd = "week";//사용자 비번

		Connection con = null;//오라클 연결 참조변수
		Statement st = null;//쿼리문 수행 참조변수
		ResultSet rs =null; //검색 결과 레코드를 저장할 참조변수
		String sql = null;//쿼리문을 저장할 변수

		Scanner sc= new Scanner(System.in);
		try {
			/*주말과제물) 게시물 목록 소스를 작성하여 다음과 같은 출력결과물이 나오게 한다.
			 * 			번호	제목		작성자	내용		등록날짜(년월일만 나오게 한다.)
	 					7	제목01	이순신	내용1	    2020-05-22
			 */
			Class.forName(driver);//오라클 jdbc드라이버 클래스 로드 실행
			con=DriverManager.getConnection(url,user,pwd);//DB연결 con 생성
			st=con.createStatement();//쿼리문 수행 st생성
			
			//번호를 기준으로  내림차순 정렬하면 큰 숫자 번호값이 먼저 정렬 
			sql ="select * from boardT Order by b_no desc";
			ResultSet rs1 = st.executeQuery(sql); //검색 결과값을 rs1 에 저장 
			
			System.out.printf("번호\t제목\t작성자\t내용\t등록날짜");
			
			//next() 는 검색된 다음 레코드 행이 있다면 true 
			while(rs1.next()) {
				int no = rs1.getInt("b_no");
				String name = rs1.getString("b_name");
				String title = rs1.getString("b_title");
				String count = rs1.getString("b_count");
				String date = rs1.getString("b_date");
				System.out.println();
				System.out.printf("%d\t%s\t%s\t%s\t%s\n",no,title,name,count,date.split(" ")[0]);
			}//while
			
/*
			while (rs1.next()) {
				System.out.println(rs1.getInt(1)+"\t"+ rs.getString(2)+"\t" + rs.getString(3) +"\t" + rs.getString(4) +"\t" +rs.getString(5).substring(0,10));
				//1,2,3,4,5 는 select문 뒤에 검색되는 컬럼 순번을 뜻함.
				// substring (1,10)은 1~10미만의 년월일을 출력한다. 
				//첫문자를 0부터 시작한다. 
			}//while
*/
		}//try
		
		catch (Exception e) {
			e.printStackTrace();
		}//catch

		// 오라클 DB를 열어놨기 떄문에 반드시 닫아줘야 한다.
		finally {
			try {

				if (sc != null) sc.close();
				if (rs != null)	rs.close();
				if (st != null)	st.close();
				if (con != null) con.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			} // catch
			
		} // finally
	}// main
}// class
