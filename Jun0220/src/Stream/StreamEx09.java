package Stream;

import java.util.Arrays;

public class StreamEx09 {
	public static void main(String[] args) {

		long count = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
						   .filter(n -> n % 2 == 0)
						   .count();
		System.out.println("2의 배수 개수 " + count);

		int sum = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
			         	.filter(a -> a % 2 == 0)
			        	.sum();
		System.out.println("2의 배수함: " + sum);

		// 1부터 10까지 배열원소값에서 올 수 있는 평균값을 double 로 출력

		double averge = Arrays.stream(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 })
				              .filter(n -> n % 2 == 1)
				              .average()
				              .getAsDouble();
		System.out.println(averge);

		int max = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				        .filter(a -> a % 2 == 0)
				        .max()
				        .getAsInt();
		System.out.println("최대값: " + max);

		int min = Arrays.stream(new int[] { 1, 2, 3, 4, 5 })
				        .filter(a -> a % 2 == 0)
				        .min()
				        .getAsInt();
		System.out.println("최대값: " + min);

		int first = Arrays.stream(new int[] {1,2,3,4,5})
				          .filter(a -> a%3 ==0 )
				          .findFirst()
				          .getAsInt();
		
		System.out.println(first);
		
		
	}//main
}//class 
