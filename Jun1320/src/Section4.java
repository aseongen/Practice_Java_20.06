import java.util.Scanner;

public class Section4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("�� ���� ������ �Է��ϼ��� : ");
		int x = in.nextInt();

		System.out.println(x/60/60 + "�ð� " + x/60%60 + "�� " + x%60 + "��");
	}
}
