import java.util.Scanner;

public class Section4 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("초 단위 정수를 입력하세요 : ");
		int x = in.nextInt();

		System.out.println(x/60/60 + "시간 " + x/60%60 + "분 " + x%60 + "초");
	}
}
