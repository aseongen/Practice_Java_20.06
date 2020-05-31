package Review_Method;

import java.util.Scanner;

/* 정수를 입력받으세요
 * For 문을 이용하여 입력 받은 수가 소수인지 판별하시오
 * 소수는 나누어 떨어지는 수가 2개 이다. 
 */
public class TEST13 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 값 입력:");
		int in = sc.nextInt();
		int count = 0;

		for (int k = 1; k <= in; k++) {
			if (in % k == 0) {
				count++;
			} // if
		} // for

		if (count == 2) {
			System.out.println(in + " 는 소수입니다.");
		} else {
			System.out.println(in + "소수가 아닙니다.");
		}//if 

	}// main
}// class
