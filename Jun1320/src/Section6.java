import java.util.Scanner;

public class Section6 {
	public static void main(String[] args) {

		System.out.println("0~999 ������ ���ڸ� �Է��ϼ���: ");

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		System.out.println("�� �ڸ����� ��: " + (x/100 + x/10%10 + x%10));
	}
}
