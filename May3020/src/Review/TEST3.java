package Review;
import java.util.Scanner;

/* 수를 입력받아 scanner 짝수, 홀수 구분하여 출력하세요
 * 3항연산자
 * 
 */
public class TEST3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("수를 입력하세요");
		int i = sc.nextInt();
		
		String  a = ( i%2==0? "짝수입니다." : "홀수입니다.");
		System.out.println(a);
	
	}//main
}//class
