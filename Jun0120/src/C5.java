/* warrior 클래스와 wizard 클래스는 동일한 속성과 기능을 갖고 있다.
 * 동일한 속성, 기능들을 player 클래스로 정의하고 상속시키세요
 * main 에서 두 클래스를 만들어 info () 를 사용해 다음과 같은 결과가 나오도록 하세요
 */
class player {
	String name;
	int hp;
	int mp;
	
	void info() {
		 System.out.println("캐릭터 명: " + name);
		 System.out.println("체력 : " + hp);
		 System.out.println("마나: " + mp);
	}
	void bash() {
		System.out.println("때리기 스킬 사용");
	}
}

 class Warrior extends player{

	@Override
	void info() {
		
		System.out.println("구르미그린달빛");
		System.out.println(1500);
		System.out.println(900);
	}

	@Override
	void bash() {
		System.out.println("얼음화살");
	}
	
}//Warrior
 class Wizard extends player{

	@Override
	void info() {
		System.out.println("강한전사");
		System.out.println(1000);
		System.out.println(500);
	}

	@Override
	void bash() {
		System.out.println("때리기스킬");
	}
	 
}//wizard
public class C5 {
	public static void main(String[] args) {

		Warrior warrior = new Warrior ();
        System.out.println("마법사 호출");
		warrior.info();
		warrior.bash();
		
		System.out.println("----------------");
		Wizard wizard = new Wizard();
		System.out.println("전사");
		wizard.info();
		wizard.bash();
		
	}
}
