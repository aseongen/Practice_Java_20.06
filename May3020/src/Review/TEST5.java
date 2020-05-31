package Review;
import java.util.Scanner;

public class TEST5 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 수를 입력하세요: ");
		int x = sc.nextInt();

		System.out.println("두번째 수를 입력하세요: ");
		int y = sc.nextInt();

		if (x < y) {
			System.out.println(y + " 이 큰수입니다.");
		} else if (x > y) {
			System.out.println(x + " 이 큰수입니다.");
		} else {
			System.out.println("두 수는 같습니다.");
		}

	}// main
}
