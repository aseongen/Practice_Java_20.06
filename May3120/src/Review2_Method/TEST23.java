package Review2_Method;

/* 1부터 입력받은 숫자 a 사이에 있는 소수의 개수를 반환하는 합수
 * printNum을 완성하시오
 * 소수는1과 자기 자신으로만 나누어지는 수 (1은 소수가 아니다)
 */
public class TEST23 {
	public static void main(String[] args) {

		System.out.println("약수의 개수: " + primeNum(3));

	}

	static int primeNum(int i) {

		int result = 0;
		for (int j = 2; j <= i; j++) {
			int count = 0;
			for (int k = 1; k <= j; k++) {
				if (i % j == 0) {
					count++;
				} // if
				if (count == 2) {
					result++;
				} // if
			} // outer for
		} // for
		return result;

	}// primeNum
}
