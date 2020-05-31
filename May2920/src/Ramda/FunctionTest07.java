package Ramda;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntSupplier;

public class FunctionTest07 {
	public static void main(String[] args) {


		Consumer<String> consumer = t -> System.out.println(t+"8");
	   //Consumer 함수형 인터페이스는 매개값은 있고, 리턴값은 없다.
		consumer.accept("java");
	
		BiConsumer<String,String> bigConsumer=(t,u) -> System.out.println(t+u);
		//BifConsumer 인터페이스는 매개변수로 T,U 타입을 받아서 처리.
		bigConsumer.accept("Java","8");
		
		DoubleConsumer doubleConsumer = d-> System.out.println("java" + d);
		//doubleConsumer 인터페이스는 매개타입으로 double 타입 하나만 가진다.
		doubleConsumer.accept(8.0);
		
		System.out.println("--------------------------------------------");
		
		IntSupplier intSupplier = () -> {
	    //IntSupplier 함수형 인터페이스는 매개변수가 없고 반환값이 있다. 
		//int결과값을 반환한다.
			int num = (int)(Math.random()*6) +1;
		 
			return num;
		};
		
		int num = intSupplier.getAsInt();
		System.out.println("주사위 눈수: " + num);
		 
		
		
		
	}//main
}//class 
