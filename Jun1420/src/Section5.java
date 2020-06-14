import java.util.Scanner;

public class Section5 {
	public static void main(String[] args) {

		String c, y;
		char r,p,s;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ã¶¼ö: ");
		c=sc.nextLine();
		
		System.out.println("¿µÈñ: ");
		y=sc.nextLine();
		
		System.out.println(" ");

	    if(c.equals(y)) {
	    	System.out.println("¹«½ÂºÎ");
	    }else if ((c.equals("r") && y.equals("s"))||(c.equals("s")&&y.equals("p"))
	    		|| (c.equals("p")&&y.equals("r"))) {
	    	System.out.println("Ã¶¼ö ½Â!");
	    }else if((c.equals("r") && y.equals("p"))||(c.equals("s")&&y.equals("r"))
	    		|| (c.equals("p")&&y.equals("s"))){
	    	System.out.println("¿µÈñ ½Â!");
	    	
	    }
	
	}
}
