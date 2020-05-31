package Review_Method;
import java.util.Scanner;

/* 키(double) 나이(int)를 입력받으세요
 * 키가140 이상이고, 나이가 8세 이상이면"놀이기구 탑승 가능 아니면 탑승 불가
 * 
 * 
 */
public class TEST4 {
	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("키를 입력하세요: ");
		double height = sc.nextDouble();
		System.out.println("나이를 입력하세요: ");
		int age = sc.nextInt();
		
		if(height>=140 && age>=8) {
		   System.out.println("놀이기구 탑승 가능합니다.");	
		}else {
			System.out.println("놀이기구 탑승이 불가능합니다.");
		}//if~else
	
	
	}//main

}//class
