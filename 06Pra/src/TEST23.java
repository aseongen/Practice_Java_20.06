import java.util.Scanner;

/* Scanner 이용해서 
 * 크기가100인 배열 선언
 * while (무한루프)에서 먹고 싶은 음식을 입력 받아 배열에 젖장하세요 
 * "그만" 입력하면 탈출
 * for 문을 통해 배열에 저장되어 있는 음식을 모두 출력하시오 
 */

public class TEST23 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("먹고 싶은 음식을 입력하세요: ");
		System.out.println("입력을 중지하려면 <그만>이라고 입력하세요");

		int count = 0;

		String[] arr = new String[100];

		while (true) {
			System.out.print(">> ");
			String food = sc.nextLine();
			System.out.println(food);

			if (food.equals("그만")) {
				System.out.println("!!입력종료!!");
				break;
			} // if

			//count : 입력받은 값을 배열에 넣고 -> 그 값을 배열 자체를 count에 누적
			arr[count] = food;
			count++;

		} // while

		for (int i = 0; i < count; i++) {
			System.out.println("내가 먹고 싶은 음식: " + arr[i]);
		} // for
		
		sc.close();
	}// main
}// class
