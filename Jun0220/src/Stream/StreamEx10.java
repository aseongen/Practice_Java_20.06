package Stream;

import java.util.Arrays;
import java.util.List;

class Student2{
	private String name;
	private int score;
	
	Student2(String name, int score){
		this.name = name ; this.score = score;
	}

	public String getName() {
		return name;
	}

	public int getScore() {
		return score;
	}
	
	
}//Student2
public class StreamEx10 {
	public static void main(String[] args) {

     List<Student2> studentList = Arrays.asList(
    		 new Student2("홍길동",92), new Student2("이순신",95),
    		 new Student2("강감찬",88)
    		 );
     
     int sum1 = studentList.stream()
    		 .mapToInt(Student2 :: getScore) //매개변수 메서드 참조로 점수를 구함.
    		 .sum();
     System.out.println("점수합: " +sum1);
     
     int sum2 = studentList.stream()
    		 .map(Student2 :: getScore)
    		 .reduce((a, b)-> a+b)//총합
    		 .get(); //총합을 얻는다
     System.out.println("점수합2: " +sum2);
    		 
     int sum3 = studentList.stream()
    		               .map(Student2 :: getScore)
    		               .reduce(0,(a,b)-> a+b); //디폴트 값 즉 기본값으로 주어진 초기값 100에 10+10 =130
     System.out.println(sum3);
     
	
	
	
	
	
	}
}
