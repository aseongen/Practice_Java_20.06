import java.util.Scanner;

public class Section3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int x = 0;

		do {
			System.out.print("���� ������ �Է��ϼ��� : ");
			x = sc.nextInt();
			if (x>0 && x % 2 == 0) {
				sum += x;
			}
		} while (x > 0);
		System.out.println("�Է��� ���� ���� �߿��� ¦��:" + sum);
	}//main
}//class
