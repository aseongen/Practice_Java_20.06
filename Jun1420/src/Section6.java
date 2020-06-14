import java.util.Scanner;

public class Section6 {
	public static void main(String[] args) {

    String c=input("Ã¶¼ö");
    String y=input("¿µÈñ");
    
    whosWin(c,y);
	
	}
     public static String input(String name) {
		Scanner input = new Scanner(System.in);
		System.out.println(name+"(r,p,s): ");
		String result=input.nextLine();
		return result;
	}
	public static void whosWin(String c, String y) {
		
		char r,s,p;
		Scanner input = new Scanner(System.in);
	
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
