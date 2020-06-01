package Ramda;

import java.util.function.IntSupplier;

public class Function14 {
	
	static int method(int x, int y) {
		IntSupplier suplier = () -> {
//			x=10; -> x는 final 상수 이기 때문에 값을 수정x .
			int result = x+y;
			return result;
		};
          int re = suplier.getAsInt();
          return re;
	}//method
	
	public static void main(String[] args) {


		int re02 = method(10,5);
		System.out.println("10+5 = " + re02);
	
	
	
	}//main
}//class
