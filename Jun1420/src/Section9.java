class Pd{
	void p(int a) {
		System.out.println(a);
	}
	void p(int...arr) {
		for(int a : arr) {
			System.out.print(" " + a +"");
		}
		System.out.println();
	}//��������
  
}//pd
public class Section9 {
	public static void main(String[] args) {
		Pd p = new Pd();
		p.p(10,20);
		p.p(10);
	}
}
