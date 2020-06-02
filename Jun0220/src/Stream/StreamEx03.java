package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx03 {
	public static void main(String[] args) {

   List<Student> studentList = Arrays.asList(
		         new Student("홍길동",98),
		         new Student("이순신",100),
		         new Student("신사임당",100)
		   
		   );
	double avg = studentList.stream()
	      .mapToInt(Student :: getScore) //매개변수 메서드 참조 , Student를 int 타입으로 변환 하면서 학생 점수를 구함. 중간처리 메서드
	      .average() //최종처리 메서드 -> 평균을 구함
	      .getAsDouble(); // 평균을 실수로 변경
	System.out.println(avg);
	
	
	}//main
}//class
