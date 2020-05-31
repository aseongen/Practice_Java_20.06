package Ramda;

interface MyFunctionalInterface5{
	
	public abstract void method();
	
	
}//MyFun interface 
class UsingLocalVariable{
	void method(int arg) { //arg는 fianl 상수 -> 수정 x, 자바 8부터는 final 생략 가능 
		
		int localVar=40;//localVar도 final 상수이다.
		
//		arg =31; ->final 상수이기 때문에 수정 불가 
		
//		localVar=41; -> final 상수이기 때문에 수정불가
		//람다식 
		MyFunctionalInterface5 fi = () ->{//fi는 지역변수
		
			System.out.println("arg = " + arg);
			System.out.println("localVar = " + localVar);
		};
		fi.method();
		
	}//method
}//class UsingLocal
public class FunctionTest05 {
	public static void main(String[] args) {

	UsingLocalVariable uv = new UsingLocalVariable();
	uv.method(20);
	
	}//main
}//class
