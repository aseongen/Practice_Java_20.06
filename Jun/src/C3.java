
/* 다음은 사람 클래스이다.
 * 아래와 같이 실행될 수 있도록 생성자를 만드세요
 */


public class C3 {
	
	String name;
	int age;
	int tall;
	
	C3(){} //생성자 
	
	public C3(String name, int age, int tall) {
     this.name =name; this.age =age; this.tall =tall;
	}

	void info() {
		System.out.println(name);
		System.out.println(age+ "세");
		System.out.println("키: " + tall);
	}//info
	
public static void main(String[] args) {
	
	C3 p1 = new C3 ( "홍길동" , 20,180);
	p1.info();
	System.out.println("-------------------------");
	
	C3 p2 = new C3();
	p2.age=40;
	p2.name="김길동";
	p2.tall=170;
	
	p2.info();
}
}
