package Review2_Method;

import java.util.Scanner;

/* Scanner 이용하여 금액을 입력받으세요 
 * 음료수 선택하면 금액에서 차감하세요(반복문)
 * 금액이 부족하다면"금액이 부족합니다"를 출력하세요
 * 4를 입력받으면 반복문을 종료하세요
 */

public class TEST17 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("금액을 투입해주세요> ");
		int my = sc.nextInt();

		while (true) {
			System.out.println("잔돈: " + my + "원");
			System.out.println("[1]데미소다:400원, [2]밀키스:500원, [3]코카콜라:600원, [4]잔돈받기, [5]그만 ");
			System.out.println("음료수를 선택해주세요> ");
			int choice = sc.nextInt();
	
			switch (choice) {

			case 1:
				if (my < 400) {
					System.out.println("잔돈이 부족합니다. 돈을 넣어주세요!");
					break;
				} else {
					my -= 400;
					System.out.println("데미소다를 받았습니다.");
				}
				break;
			case 2:
				if (my < 500) {
					System.out.println("잔돈이 부족합니다. 돈을 넣어주세요!");
					break;
				} else {
					my -= 400;
					System.out.println("밀키스를 받았습니다.");
				}
				break;
			case 3:
				if (my < 600) {
					System.out.println("잔돈이 부족합니다. 돈을 넣어주세요!");
					break;
				} else {
					my -= 400;
					System.out.println("코카콜라를 받았습니다.");
				}
				break;
			case 4:
				System.out.println("남은 금액: " + my + "입니다. 확인해주세요");
				break;
				
			default:
				System.out.println("그만");
				break;
			}// switch
			
		} // while

	}// main
}// class
