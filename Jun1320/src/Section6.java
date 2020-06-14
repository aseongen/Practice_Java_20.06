import java.util.Scanner;

public class Section6 {
	public static void main(String[] args) {

		System.out.println("0~999 사이의 숫자를 입력하세요: ");

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();

		System.out.println("각 자리수의 합: " + (x/100 + x/10%10 + x%10));
	}
}
