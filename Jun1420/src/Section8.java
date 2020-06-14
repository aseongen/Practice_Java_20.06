
public class Section8 {
	public static void main(String[] args) {

		foo("æ»≥Á", 1);
		foo("æ»≥Á«œººø‰", 1, 2);
		foo("¿ﬂ¿÷æÓ");

	}

	private static void foo(String x, int i) {
		System.out.println(x + "," + i);
	}

	private static void foo(String x, int i, int j) {
		System.out.println(x + "," + i + "," + j);
	}

	private static void foo(String x) {
		System.out.println(x);

	}

}
