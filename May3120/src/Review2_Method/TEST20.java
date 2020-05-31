package Review2_Method;

import java.util.Arrays;

public class TEST20 {

	static void method1() {
		System.out.println("안녕");
	}// method1

	static String method2(String a) {
		return a;
	}// method2

	static double method3(int i, int j, double k) {
		return i + j + k;
	}// method3

	static String method4(int a) {
		return (a % 2 == 0 ? "짝수" : " 홀수");
	}// method4

	static void method5(String a, int b) {
		for (int i = 1; i <= b; i++) {
			System.out.println(a);
		}
	}// method5

	static int maxNum(int x, int y) {
		if (x > y) {
			return x;
		} else {
			return y;
		} // if else
	}// maxNum

	static int juldae(int a) {
		return a > 0 ? a : -a;
	}// juldae

	static int method6(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i++) {
			sum += i;
		}
		return sum;
	}// method6

	static int method7(int[] a) {
		return a.length;
	}// method7

	static String[] method8(String a, String b) {
		String[] result = { a, b };
		return result;
	}// method8

	public static void main(String[] args) {

		method1();
		System.out.println(method2("안녕"));
		System.out.println(method3(1, 2, 3.5));
		System.out.println(method4(7));
		
		method5("하아", 2);
		System.out.println(method6(3));

		System.out.println("큰수:" + maxNum(30, 40));
		System.out.println("절대값: " + juldae(-15));

		int[] a = { 1, 2, 3, 4, 5, 6 };
		System.out.println(method7(a));

		System.out.println(Arrays.toString(method8("후으", "니니")));

	}
}
