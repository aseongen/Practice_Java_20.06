package Daily;

class Wizard {

    int p; int mp; String name;
	Wizard(){}
	Wizard(String name) {
		this.name= name;
	}
	Wizard(int p, int mp){
		this.mp = mp; this.p = p;
	}
	
	void info () {
		 System.out.println("캐릭터 명: 마법사");
		System.out.println("체력: " +500);
		System.out.println("마나 : " + 1000);
	}
}
class Warrior{
	 int p; int mp; String name;
	 Warrior (){}
	 Warrior(String name){
		 this.name =name;
	 }
	 Warrior(int p, int mp){
		 this.mp=mp; this.p = p;
	 }
	 void info(){
		 System.out.println("캐릭터 명: 전사");
		 System.out.println("체력: " +1000);
		 System.out.println("마나 : " + 500);
	 }
}

public class C8 {
	public static void main(String[] args) {

System.out.println("마법사");
	Wizard play1 = new Wizard("구르미그린");
	play1.info();
	
	System.out.println();
	
	System.out.println("전사");
	Warrior play2 = new Warrior("전사");
	play2.info();
	}
}
