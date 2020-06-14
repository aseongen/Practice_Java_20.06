class info{
	String name;
	String price;
	
	void info() {
		System.out.println(name);
		System.out.println(price );
	}
}
public class c1 {
	public static void main(String[] args) {

		info();
		info2();
		
	}//main
	
	static int price=500;
	static String name="피자빵";
	static void info() {
		System.out.println(price +"원");
	    System.out.println(name);
	}//price 
	
	// 딸기케익
	static int price2 =1500;
	static String name2 ="딸기케익";
	static void info2() {
		System.out.println(price2 + "원");
		System.out.println(name2);
	}//price2 
	
}
