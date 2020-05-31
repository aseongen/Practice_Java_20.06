package Review_Method;

import java.util.Scanner;

public class TEST12 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수를 입력하세요 > ");

		int n = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(n +" x " + i + " = " +(n*i));
		}//for
	
	
	sc.close();
	
	
	}
}
