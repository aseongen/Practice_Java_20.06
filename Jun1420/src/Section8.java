
public class Section8 {
	public static void main(String[] args) {

		foo("�ȳ�", 1);
		foo("�ȳ��ϼ���", 1, 2);
		foo("���־�");

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
