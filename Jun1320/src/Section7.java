import java.util.Scanner;

public class Section7 {
	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("���� �̼� ����: ");
    int x = sc.nextInt();
    
    System.out.println("���� �̼� ����");
    int y = sc.nextInt();
    
   System.out.println("�Ϲ��̼� ����");
    int z = sc.nextInt();
    
    System.out.println((x+y+x>=140)&&(x>=70)&&(y<=30)&&(z>=30)||(y+z>=80)?"���������մϴ�.":"��������ּ���");


    sc.close();
	
	}
}
