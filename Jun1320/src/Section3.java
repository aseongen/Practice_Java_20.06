import java.util.Scanner;

public class Section3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double PI = 3.14;

		System.out.println("������� �ظ� ������?");
		int x = sc.nextInt();

		System.out.println("������� ����?");
		int y = sc.nextInt();

		System.out.println("������� ����: " + x * x * PI * y);

	}
}
