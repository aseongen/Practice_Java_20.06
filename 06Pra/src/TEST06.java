class Member{
	String name;
	int age;
	
	Member(){
		name="ddd" ; age =13;
	}
	void p () {
		System.out.println(name +  age );
	}
}
public class TEST06 {
	public static void main(String[] args) {

		Member mb = new Member();
		mb.p();
	}
}
