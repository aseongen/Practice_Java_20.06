package Review2_Method;

import java.util.Scanner;

public class TEST18 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] kakao = new String[5];
		int count = 0;

		while (true) {
			System.out.print("캐릭터 친구들을 입력해주세요 >> ");
			String name = sc.nextLine();
			
			if (name.equals("그만")) {
				System.out.println("그만 입력합니다.");
				break;
			} // if

			kakao[count] = name;
			count++;
			
			System.out.println("["+name +"] 등록완료");
			System.out.println("------------------------");


			
		} // while
	
		System.out.println(count+"명의 친구들이 입력되었습니다.");

	}//main
}//class
