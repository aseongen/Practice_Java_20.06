import java.util.Scanner;

public class Section2 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("����� �Է����ּ��� ");
    int x= sc.nextInt();
    
    switch(x){
    case 1:
    	System.out.println("���� ���߽��ϴ�.");
    	break;
    case 2:
    case 3:
    	System.out.println("���߽��ϴ�.");
    	break;
    case 4:
    case 6:
    case 7:
    	System.out.println("�����Դϴ�.");
    	break;
    default:
    	System.out.println("����ؾ߰ڽ��ϴ�.");
    }
	sc.close();
	}
}
