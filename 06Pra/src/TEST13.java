
class A2 {
	int x, y;

	A2(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class B extends A2 {
	int z;

	B(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}

	void p() {
		System.out.println(x + " " + y + " " + z);
	}
}

public class TEST13 {
	public static void main(String[] args) {


		B a = new B(100,200,300);
		a.p();
	}
}
