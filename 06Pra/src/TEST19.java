interface Gugudan {
	void gugudan(int k);
}

interface Sum1 {
	void sum1(int[] arr);
}

interface Total extends Sum1, Gugudan {
	void greeting(String name);
}

class SubTotal implements Total {

	@Override
	public void sum1(int[] arr) {
		int sum = 0;
		for (int k : arr) {
			sum += k;
		}
		System.out.println("누적합: " + sum);
	}// Sum1

	@Override
	public void gugudan(int k) {
		System.out.println(k + "단");

		for (int i = 1; i <= 9; i++) {
			System.out.println(k + "*" + i + "=" + (k * i));
		}
	}

	@Override
	public void greeting(String name) {
		System.out.println(name + "안녕");
	}
}

public class TEST19 {

	public static void main(String[] args) {

		SubTotal st = new SubTotal();
		st.sum1(new int[] { 100, 200, 300 });
		st.gugudan(5);
		st.greeting("나나");
	}
}
