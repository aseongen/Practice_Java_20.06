import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class BoardEX {
	public static void main(String[] args) {

 
		String driver = "oracle.jdbc.OracleDriver";
        //오라클 접속 주소, 1521: 포트번호. xe는 디비명
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		String user = "week";
		String pwd = "week";
		
		Connection con = null;
		PreparedStatement pr = null;
		String sql =null;
        
	    Scanner sc = new Scanner (System.in);
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user,pwd);
		    
			System.out.println("이름 입력하세요 >>> ");
			String b_name = sc.nextLine();
			System.out.println("제목 입력하세요 >>> ");
			String b_title = sc.nextLine();
			System.out.println("내용 입력하세요 >>> ");
			String b_count = sc.nextLine();
			
			sql = "insert into boardT values(b_no_seq.nextval,?,?,?,sysdate)";
			pr=con.prepareStatement(sql);
			
            pr.setString(1, b_name);
            pr.setString(2, b_title);
            pr.setString(3, b_count);

			int re = pr.executeUpdate();
			
			if(re==1) {
				System.out.println("성공");
			}else{
				System.out.println("실패");
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		} // try~ catch

		finally {
			try {
				if (pr != null) pr.close();
				if (con != null) con.close();

			} catch (Exception e) {
				e.printStackTrace();
			} // try~catch
		} // finally


	}
}
