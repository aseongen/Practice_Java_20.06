class A{
	String b;
	String d;
	int p;
	
	public A() {
	}
	 A(String b, String d, int p){
		this.b=b; this.d=d; this.p = p;
	}

}
public class TEST01 {
	public static void main(String[] args) {

		A aa = new A();
		aa.b="dd"; aa.d="cc";
		System.out.println(aa.b+aa.d);
		
		
	}
}
