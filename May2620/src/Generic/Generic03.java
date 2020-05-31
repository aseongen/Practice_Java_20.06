package Generic;
class Util2{
	static<T extends Number> int compare(T t1, T t2) {
/* <T extends Number>
 * : 제한된 제네릭 타입문법이다. 즉, Number 타입 또는 그 자손 타입만 와야한다.
 * 
 * Number 클래스)
 * : http://blog.daum.net/question0921/1062
 * :  byte, integer Double, short, Float, Long 
 * : 자바에서는 기본 데이터형에 대응하는 wrapper 클래스를 제공하고, 기본데이터형을 객체로 감싸는 것.
 * : wrapper 감싸는 이유: 클래스에서 제공하는 메소드를 쉽게 사용할 수 있고 값의 변환이 쉽기 때문이다. 
 */

		//기본 실수 숫자로 변경 
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		//v1, v2보다 작으면 -1 같으면 0, 더크면 1을 반환한다.
		return Double.compare(v1, v2);
		
	}//static
}//class Util2

public class Generic03 {
	public static void main(String[] args) {

		int result01 = Util2.compare(10, 20);
		System.out.println(result01);
		
		int result02 = Util2.compare(10.3, 5.2);
		System.out.println(result02);
		
	}
}//제네릭 타입간의 형변환이 안된다.
