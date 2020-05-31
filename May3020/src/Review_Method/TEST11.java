package Review_Method;

import java.util.Arrays;
import java.util.Scanner;

/* 양수를 입력받아 받은 수 키의 배열을 생성
 * 배열에 1~입력 받은수까지 차례대로 값을 넣으세요 
 */
public class TEST11 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 ");
		System.out.println("그만하고 싶으면 0 을 입력해주세요");
		int i = sc.nextInt();
		
		int[] arr = new int[i];
		int j = 0;

		System.out.println(Arrays.toString(arr));
		sc.close();
	}// main
}// class
