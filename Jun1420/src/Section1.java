import java.util.Scanner;

public class Section1 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("나이를 입력하세요: ");
    int x = sc.nextInt();
    
    if(x>=19) {
    	System.out.println("성년입니다.");
    }else {
    	System.out.println("미성년입니다.");
    }
    
    sc.close();
	
	}

}
