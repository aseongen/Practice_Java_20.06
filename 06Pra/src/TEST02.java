class Gu{
	public void Gugudan(){
	for(int i=2; i<=9; i++) {
		System.out.println(i + "단");
		for(int k=1; k<=9; k++) {
			System.out.println(k+ " * " + i + "=" + (k*i));
		}
		System.out.println();
	}
}
}
public class TEST02 {
public static void main(String[] args) {
	
	Gu gu = new Gu();
	gu.Gugudan();
}
}
