class Computer{
	int sum(int[] arr) {
		int sum=0;
		for(int k : arr) {
			sum+=k;
		}
       return sum;
	}
	
	int sum2 (int...arr) {
		int sum=0;
		for(int j : arr) {
			sum+=j;
		}
		return sum;
	}
}
public class TEST09 {
public static void main(String[] args) {
	
	Computer com = new Computer();

	System.out.println(com.sum(new int[] {1,2,3}));
}
}
