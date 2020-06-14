import java.util.Scanner;

public class Section2 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("등수를 입력해주세요 ");
    int x= sc.nextInt();
    
    switch(x){
    case 1:
    	System.out.println("아주 잘했습니다.");
    	break;
    case 2:
    case 3:
    	System.out.println("잘했습니다.");
    	break;
    case 4:
    case 6:
    case 7:
    	System.out.println("보통입니다.");
    	break;
    default:
    	System.out.println("노력해야겠습니다.");
    }
	sc.close();
	}
}
