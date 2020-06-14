/* 3 항 연산식을 이용해서 1~100까지 3의 배수의 합 구하기
 */


public class TEST22 {
	public static void main(String[] args) {

		int sum=0;
		
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum+=i;
			}//if
		}//for
		System.out.println(sum);
	
		int j=1;
	
		for(int i=1; i<=100;i++) {
		int a = ((j%3==0) ? sum+=j : j);
		
		}
		System.out.println(sum);
		
	}//main
}//class 
