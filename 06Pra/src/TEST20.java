import java.util.Scanner;

/* 정수를 입력받고 
 * for 문을 이용해 입력받은 수까지 소수들의 합 
 * 
 */
public class TEST20 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 값 입력:");
		int in = sc.nextInt();
	    int sum =0;
		
		for(int i = 2; i<=in; i++) {
				int count = 0;
			
			for (int k=1; k<=i;k++) {
				if(i%k==0) {
					count ++;
				}//if
				
			}//inner for
			
			if(count==2) {
			  sum+=i;
				
			} //if
			
		} //outer for

	
	} //main

} //class
