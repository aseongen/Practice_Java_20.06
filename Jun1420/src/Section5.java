import java.util.Scanner;

public class Section5 {
	public static void main(String[] args) {

		String c, y;
		char r,p,s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ö��: ");
		c=sc.nextLine();
		
		System.out.println("����: ");
		y=sc.nextLine();
		
		System.out.println(" ");

	    if(c.equals(y)) {
	    	System.out.println("���º�");
	    }else if ((c.equals("r") && y.equals("s"))||(c.equals("s")&&y.equals("p"))
	    		|| (c.equals("p")&&y.equals("r"))) {
	    	System.out.println("ö�� ��!");
	    }else if((c.equals("r") && y.equals("p"))||(c.equals("s")&&y.equals("r"))
	    		|| (c.equals("p")&&y.equals("s"))){
	    	System.out.println("���� ��!");
	    	
	    }
	
	}
}
