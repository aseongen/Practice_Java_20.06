import java.util.Scanner;

public class Section1 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("���̸� �Է��ϼ���: ");
    int x = sc.nextInt();
    
    if(x>=19) {
    	System.out.println("�����Դϴ�.");
    }else {
    	System.out.println("�̼����Դϴ�.");
    }
    
    sc.close();
	
	}

}
