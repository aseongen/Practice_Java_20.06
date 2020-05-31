package Review2_Method;

public class TEST22 {
	
	public static void main(String[] args) {

		System.out.println(sum(6));
	
	
	
	}

	private static int sum(int i) {

		int total=0;
		for(int j=1;j<=i;j++) {
			if(i%j==0) {
				total+=j;
			}
			
		}
		
		return total;
	}

}
