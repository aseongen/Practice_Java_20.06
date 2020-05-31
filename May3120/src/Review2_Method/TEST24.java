package Review2_Method;

/* 
 * sumNum 은 매개변수 2개를 받습니다.
 * 두 매개변수 사이에 속한 모든 정수의 합을 구하는 sumNum을 완성
 * 두 매개변수의 크기는 정해지지 않았다.
 */
public class TEST24 {
	public static void main(String[] args) {

		System.out.println("수의 합: " + sumNum(7,9));
		System.out.println("수의 합: " + sumNum(9,7));
		System.out.println("수의 합: " + sumNum(5,5));
	}
	
	static int sumNum(int a, int b) {
		
		int result=0;
		
		if(a==b) {
             return a;
		}//if 

		int m;
        for (int i= a>b? b:a; i<= (m=a>b? a:b);i++){
        	result +=i;
        }//for
		
		return result;
	}//sumNum
}
