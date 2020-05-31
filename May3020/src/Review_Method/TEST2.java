package Review_Method;
/* Math random()을 이용하여 -5~5 의 랜덤수를 발생시키세요
 * 3항 연산 식을 사용해서 절대값을 구하는 식을 쓰세요 
 */
public class TEST2 {
	public static void main(String[] args) {

		int j=(int)(Math.random()*6)+(-5);
		System.out.println(j);
		
		int i =(j<0? -j  : j);
		System.out.println(i);
		
	}//main
}//class 
