//추상메서드를 오버라이딩 하지 않으면 서브 클래스도 추상클래스가되어야한다.

abstract class Abs05   {
	abstract void m03(); //추상 메서드
	
	void m04() {
         System.out.println("일반 메서드02()");
	}
}//Abs05

abstract class Abs06 extends Abs05{
	void m05() {
		System.out.println("일반 메서드 m03()");
	}
}//Abs06

class SubClass06 extends Abs06{
	@Override
	void m03() { //추상메서드 정의한 것에 한해서 오버라이드
		System.out.println("오버라이딩 된 m03()");
	}
	
}//SubClass

public class TEST18 {
 
	public static void main(String[] args) {

		SubClass06 sub = new SubClass06();
		sub.m03();  	sub.m04(); 		sub.m05();
        //각각 상속 받아서 호출	
	}
}
