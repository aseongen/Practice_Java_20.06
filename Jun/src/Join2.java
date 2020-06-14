import java.util.Scanner;

import com.naver.dao.JoinDAO2;
import com.naver.vo.JoinVO2;

public class Join2 {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	JoinDAO2 jd = new JoinDAO2();
	
	int su2;
	
	while(true) {
		System.out.print("0.종료\t1.회원가입\t 2.로그인\t 3.비밀번호 변경\t4.개인 정보 출력\t5.계정 삭제\n선택 >> ");
		su2=sc.nextInt();
		
		if(su2==0) {
			System.out.println("종료");
			break;
		}else if (su2==1) {
			JoinVO2 jvo = new JoinVO2();
			System.out.println("아이디를 입력하세요");
			String id = sc.nextLine();
			
			System.out.println("이름을 입력하세요");
			String name =sc.nextLine();
			System.out.println("패스워드를 입력하세요");
			String pwwd = sc.nextLine();
			
			jvo.setG2_id(id);jvo.setG2_name(name); 
			jvo.setG2_pwd(pwwd);
			
			jd.memberJoin(jvo);
			
		}else if (su2 ==2 ) {
			JoinVO2 jvo = new JoinVO2();
			
		}
		
		
		
	}//while
	}//main
}
