package Review_Method;

import java.util.Scanner;

/* 정수를 입력받으세요
 * 2중 for 문을 이용하여 소수들의 합을 구하시오
 * 힌트) 입력 받은 수까지 반복, 내부 for 문 에서 외부 for 문의 수까지 반복(나누어 떨어지는 수 체크)
 * 
 */
public class TEST15 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력 받으세요>> ");
		int in = sc.nextInt();
		int sum = 0;// 누적합

		for (int k =1; k <= in; k++) {
			int count = 0;// 카운트변수
			
			for (int j = 1; j <= k; j++) {
				if (k % j == 0) {
					count++;// 카운트 누적
				} // inner if
			} // inner for
			if (count == 2) {
				sum += k;
			}//outer if
		} // outer for

		
		System.out.println(" 소수의 누적합: " + sum);

	}// main
}// class
