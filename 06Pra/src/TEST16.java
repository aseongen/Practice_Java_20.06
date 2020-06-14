class Parent11{
	String field1;
	
	public void method01 () {
		System.out.println("Parent11 method01()");
	}
	public void method02() {
		System.out.println("Parent11 method02()");
	}
	
} //Parent11  class
class Child11 extends Parent11{
	String field2;
	
	public void method03() {
		System.out.println("Child method03()");
	}
}

public class TEST16 {
	public static void main(String[] args) {
/*문제)
 * 업캐스팅한 p01 객체를 생성해서 부모 클래스를 호출하고, 
 *  instanceof  연산자를 활용해 p01 다운캐스팅이 가능한지 확인한 후 ch를 생성하고, 
 *  부모클래스를 상속 받아서 호출하고, 자손 클래스 메서드를 호출해라
 * 
 */
		Parent11 p01 = new Child11(); //업캐스팅
	         	p01.method01();
		        p01.method02();
		        
		if( p01 instanceof Child11) { //다운캐스팅  가능여부
		     System.out.println("다운캐스팅이 가능합니다.");
			 Child11 ch = (Child11)p01; //다운캐스팅 
			    ch.method01(); //parent
			    ch.method02(); //parent
                ch.method03(); //child
			 
		}else {
			System.out.println("다운캐스팅이 불가능합니다. ");
		} //if~elsea
	}//main
}
