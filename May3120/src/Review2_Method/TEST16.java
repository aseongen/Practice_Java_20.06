package Review2_Method;

import java.util.Scanner;

/* 두수의 더하기를 맞추는 문제를 지속적으로 출제하는 프로그램이다.
 * 2가지 정수를 1~100사이의 난수를 발생 시켜 지속적으로 문제를 출제한 후 정답이면
 * 정답 카운트를 +1 씩, 틀리면 오답 카운트를 +1 씩 올려주는 프로그램을 만드시오
 * 또한, 이 프로그램은 0을 입력받으면 반복을 중단합니다. 
 */
public class TEST16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int plus = 0;// 누적합
		int minus = 0;

		while (true) {
			int munje1 = (int) (Math.random() * 100) + 1;
			int munje2 = (int) (Math.random() * 100) + 1;

			System.out.println(munje1 + "+" + munje2 + "= ?");
			System.out.println("------------------------------");
			System.out.println("[문제를 그만 푸시려면 0을 입력하세요]");
			int a = sc.nextInt();

			if (a == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (munje1 + munje2 == a) {
				plus++;
			} else if (munje1 + munje2 != a) {
				minus++;
			} // else if
		} // while

		System.out.println("정답 횟수: " + plus);
		System.out.println("오답 횟수: " + minus);

	}// main
}// class
