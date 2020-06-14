import java.util.Scanner;

public class Section3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double PI = 3.14;

		System.out.println("원기둥의 밑면 반지름?");
		int x = sc.nextInt();

		System.out.println("원기둥의 높이?");
		int y = sc.nextInt();

		System.out.println("원기둥의 부피: " + x * x * PI * y);

	}
}
