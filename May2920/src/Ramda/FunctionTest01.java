package Ramda;

@FunctionalInterface
/* @FunctionalInterface 에너테이션
 * : 함수형 인터페이스로 추상메서드가 딱 한개만 올 수 있다.
 * : 함수형 인터페이스는 자바 8에서 추가되었고, 람다식 즉, 함수형 언어를 위한 인터페이스이다.
 * : 람다식도 자바 8에서 추가되었다.
 */

interface MyFunctionalInterface{
	//추상메서드를 정의해야한다.
	//함수형 인터페이스는 추상메서드를 한개 만들어 줘야 에러가 발생하지 않는다. 
	
	void method();
//  int get(); -> 추상메서드 두개 생성시 에러 
	
	
}

public class FunctionTest01 {
	public static void main(String[] args) {

    MyFunctionalInterface fi; //함수형 인터페이스로 참조변수 선언가능
    
    fi = () ->{ //추상메서드가 오버라이딩 됨 
    	String result ="method() 호출";
    	System.out.println(result);
    };//메서드명과 리턴타입이 없는 람다식(->)
    
    fi.method();
//---------------------------------------------------------------	
    fi = () -> {System.out.println("두번째 method() 호출" );};
    fi.method();
//---------------------------------------------------------------
	fi =() -> System.out.println("세번째 method() 호출");
	fi.method();
	
	}//main
}//class
