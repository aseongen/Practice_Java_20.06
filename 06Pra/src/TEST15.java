class Parent10 {
	void m01() {
		System.out.println("부모 클래스 메서드 01()");
	}
	
	void m02() {
		System.out.println("Parent method02()");
	}
}//class Parent 

class Child10 extends Parent10{

	@Override
	void m01() {
		System.out.println("Child m02() 오버라이딩");
	}

	void m03() {
		System.out.println("Child m03()오버라이딩 ");
	}

	
}//class Child10

public class TEST15 {
	public static void main(String[] args) {

		Parent10 p = new Child10();//업캐스팅
		p.m02();//업캐스팅 후 오버라이딩 된 메서드 호출 
		p.m01();//조상클래스 메서드 호출
//		p.m03(); ->호출 불가능 
		
		if(p instanceof Child10) {
			Child10 p2 = (Child10)p;
			System.out.println("다운캐스팅");
		}
	}

}
