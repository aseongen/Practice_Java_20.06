package Review_Method;

/*1~100 번까지의 3의 배수의 합 (if 사용)
 * 3항연산식을 이용해서 구해보세요
 */

public class TEST10 {
	public static void main(String[] args) {

		int sum = 0;
		if (true) {
			for (int i = 1; i <= 100; i++) {
				if (i % 3 == 0) {
					sum += i;
				}//inner if
			}//for
			System.out.println("1부터 ~ 100까지 3의 배수의 합: " + sum);
		} // if
	}// main
}// class
