package Daily;
/*
 * 다음과 같은 실행 결과가 나올 수  있도록 Calculator 클래스에 
 * add()를 오버로딩 하세요
 * 
 * calculator 클래스에 값 누적하는 result 멤버 변수
 */

class Calculator {

	int result;
	int i;

	Calculator() {
	} // 생성자

	void add(int j) {

		for (int i = 1; i <= j; i++) {
			result += i;
		} // for
	}//add
//-------------------------------------------	
	void add2 (int...a) {
		
		for(int i : a ) {
			result +=i;
		}
	}//add2
	
	void result() {
		System.out.println(result);
	}

}// calculator

public class C6 {
	public static void main(String[] args) {

		Calculator cal = new Calculator();
		cal.add(1);
		System.out.println("call의 누적합:  " + cal.result);

		cal.add2(2,3);
		System.out.println("call의 누적합:  " + cal.result);
		
		cal.add2(1,2,3);
		System.out.println("call의 누적합:  " + cal.result);
		
		cal.add2(1,2,3,4);
		System.out.println("call의 누적합:  " + cal.result);
	}
}
