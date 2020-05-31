package Review2_Method;

import java.util.Scanner;

/* 추가) 입력받은 캐릭터가 있으면 중복 되었다고 알려주기
 */
public class TEST19 {
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

			/* 추가) 입력받은 캐릭터가 있으면 중복 되었다고 알려주기 */

			boolean check = true;
			for (int i = 0; i <= kakao.length; i++) {
				if (name.equals(kakao[i])) {
					check = false;
					break;
				} // inner if
			} // for

			if (check) {
				kakao[count] = name;
				count++;

				System.out.println("[" + name + "] 등록완료");
				System.out.println("------------------------");
			} else {
				System.out.println("이미 있습니다. 다시입력해주세요");
			}

		} // while

		System.out.println(count + "명의 친구들이 입력되었습니다.");
		sc.close();
	}// main
}// class
