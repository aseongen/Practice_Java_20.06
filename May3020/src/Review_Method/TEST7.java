package Review_Method;
/* 양의 정수를 입력받아 짝수라면 "x는 짝수입니다. 
 * 홀수라면 "x는 홀수 입니다.
 * 0이라면 "0입니다"
 * 음수라면 "음수입니다."를 출력하세요 
 * 
 */

import java.util.Scanner;

public class TEST7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.println("정수를 입력하세요 > ");
        int x = sc.nextInt();
        
        if(x%2==0 && x !=0) {
        	System.out.println(x + "는 짝수 입니다. ");
        }else if (x%3==0 && x != 0) {
        	System.out.println(x + "는 홀수입니다.");
        }else if(x==0) {
        	System.out.println(x + "는 0입니다.");
        }else if(x<0){
        	System.out.println(x + "는 음수입니다.");
        }
	}//main
} //class 
