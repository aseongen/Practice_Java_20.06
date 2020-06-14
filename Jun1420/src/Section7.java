
public class Section7 {
	public static void main(String[] args) {

    for(int i=1; i<=5;i++) {
    	printStar(i);
    	System.out.println();
    }
	
	
	}//main

	private static void printStar(int i) {
		for (int j=0;j<i;j++) {
			System.out.print("*");
		}
		System.out.print("");
		
		
	}
}
