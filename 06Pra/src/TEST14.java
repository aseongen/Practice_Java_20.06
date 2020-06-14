class A3{
	int x=100, y;
	
	A3(){}
	
	A3(int x, int y){
      this.x=x; this.y=y;
	}
	void p () {
		System.out.println(x);
		System.out.println(y);
	}
}
class B3 extends A3{
	int z;
	
	B3(int x, int y, int z){
		super(x,y);
		this.z=z;
	}
	void p () {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
	}
}//class B3
public class TEST14 {
	public static void main(String[] args) {

		A3 aa = new B3(3,4,5);
		aa.p();
		
		if (aa instanceof B3) {
			B3 bb = (B3)aa;
			System.out.println("다운 캐스팅 가능 ");
		    bb.p();
		}//if 
		
	}
}
