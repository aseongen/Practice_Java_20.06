import java.util.Scanner;

public class TEST03 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
        
		int arr[] = new int [10];
		int sum =0;
		
		for (int i=1; i<arr.length; i++) {
			System.out.println(i);
       arr[i] = sc.nextInt();
       sum+=arr[i];
		}
		for (int i=0; i<arr.length-1;i++) {
			System.out.println(arr[i]);
		}
		System.out.println(arr[9]);

	}
}
