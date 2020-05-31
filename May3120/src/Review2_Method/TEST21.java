package Review2_Method;

public class TEST21 {
	
	public static void main(String[] args) {


	String str = java(5);
	System.out.println(str);
	
	
	
	}

	 static String java(int i) {
		 
		 String result = "" ;
		 for(int j=1;j<=i;j++) {
			 String abc = (j%2==1)? "자" : "바";
			 result += abc;
		 }
		 
		 return result;
	}
}
