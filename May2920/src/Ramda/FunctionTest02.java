package Ramda;

interface MyFunctionalInterface2 {
	public void method(int x);
	// 리턴 타입이 없고, 매개변수가 있는 추상 메서드, abstract 키워드는 생략됨.

}

public class FunctionTest02 {
	public static void main(String[] args) {

		MyFunctionalInterface2 fi;

		fi = (x) -> {
			int result = x * 10;
			System.out.println(x + " x10 = " + result);
		};

		fi.method(10);

		fi = (x) -> {
			System.out.println(x * 5);
		};
		
		fi.method(5);

		fi = x -> System.out.println(x * 10);
		fi.method(10);

	}// main
}// class
