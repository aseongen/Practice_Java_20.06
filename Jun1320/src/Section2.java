import java.util.Scanner;

public class Section2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하세요");

		int x = sc.nextInt();

		System.out.printf("%d의 제곱은 %d", x, x * x);

	}
}
