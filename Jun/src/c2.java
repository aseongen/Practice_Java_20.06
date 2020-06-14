class info2 {
	String name;
	int age;

	void p() {
		System.out.println(name);
		System.out.println(age);
	}

}// class info2

public class c2 {
	public static void main(String[] args) {
		info();
		info2();
	}

	static String name = "홍길동";
	static int age = 19;
	static void info() {
		System.out.println(name);
		System.out.println(age + "세");
	}

	static String name2 = "김길동";
	static int age2 = 30;
	static void info2() {
		System.out.println(name2);
		System.out.println(age2 + "세 ");
	}
}
