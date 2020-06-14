class Member2{
	String name;
	int age;
	
	Member2(String name, int age){
		this.name=name; this.age=age;
	}
	void p () {
		System.out.println(name +  age );
	}
}
public class TEST07 {
	public static void main(String[] args) {

		Member2 mb = new Member2("aaa",13);
		mb.p();
	}
}
