package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx04 {
	public static void main(String[] args) {

		List<Student> studentList = Arrays.asList( //new array<Student>
				     new Student("홍길동", 10),
				     new Student("이순신", 20),
				     new Student("유미선", 30)
				     
		);
		Stream<Student> stream = studentList.stream();
		stream.forEach(s-> System.out.println(s.getName()));
		
		System.out.println();
		
		String [] strArray = {"홍길동","신용권","김미나"};
		Stream<String> strStream = Arrays.stream(strArray);
		//배열로부터 문자열 객체 타입요소를 처리하는 스트림 생성
		strStream.forEach(name -> System.out.println(name + " "));
		
		System.out.println();
		
		int[] intArray = {10,20,30,40,50};
		//배열로부터 int 타입 요소를 처리하는 스트림 생성
		IntStream intStream = Arrays.stream(intArray);
		 
		intStream.forEach(num -> System.out.println(num + " "));
		
		System.out.println();
		
		IntStream stream2 = IntStream.rangeClosed(1, 100);
		//rangeClosed() : 1부터 100까지 순차적으로 제공하는 IntStream 생성
		
		stream2.forEach(a-> sum += a);//1부터100까지 누적합
		System.out.println("총합 : " + sum );
		
		
		
	}//main
	static int sum ;//정적변수
	
	
}//class
