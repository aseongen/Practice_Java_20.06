import java.util.Scanner;

public class Section7 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("전공 이수 학점: ");
    int x = sc.nextInt();
    
    System.out.println("교양 이수 학점");
    int y = sc.nextInt();
    
   System.out.println("일반이수 학점");
    int z = sc.nextInt();
    
    System.out.println((x+y+x>=140)&&(x>=70)&&(y<=30)&&(z>=30)||(y+z>=80)?"졸업가능합니다.":"재수강해주세요");


    sc.close();
	
	}
}
