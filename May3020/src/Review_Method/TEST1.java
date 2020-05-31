package Review_Method;
/* Math.random 사용해서 1~100까지 랜덤 정수를 발생시키세요
 * i가 짝수라면 짝수 홀수라면 홀수 출력하는 3항연산식을 세우세요 
 * 
 */
public class TEST1 {
	public static void main(String[] args) {

		int j = (int) (Math.random() * 100) + 1;
		String h = (j % 2 == 0 ? "짝수 입니다" : "홀수입니다.");

		System.out.println("랜덤수는: " + j);
		System.out.println("3항연산의 결과: " + h);

	}// main

}// class
