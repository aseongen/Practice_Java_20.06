package Ramda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Student2{
	private String name;
	private String sex;
	private int score;
	
	Student2(String name, String sex, int score){
		this.name =name; this.sex= sex; this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
}//Student

public class FunctionTest09 {

	private static List<Student2> list = Arrays.asList(
			
			new Student2("홍길동","남자", 90),
			new Student2("김순희","여자", 90),
			new Student2("김자바","남자", 95),
			new Student2("박한나","여자", 92)
			);
			
	static double avg(Predicate<Student2> predicate) {
	//predicate 인터페이스
    //: 매개값을 조사해서 boolean T/F 반환한다. 
		
		int count=0;
		int sum=0;
		for(Student2 student : list) {
			if(predicate.test(student)) {
			   count++;
			   sum += student.getScore();
			}//if
		}//for
		//실수 평균을 구해서 반환
		return (double)sum/count;
		
	}//avg
	
	public static void main(String[] args) {

      double maleAvg = avg(t -> t.getSex().equals("남자"));
      //predicate 인터페이스의 영향으로 equals 로 작성해야 한다. 
      System.out.println("남자 평균 수 : " +maleAvg);
      
      double femaleAvg = avg(t->t.getSex().equals("여자"));
     System.out.println("여자 평균 수 : " + femaleAvg);
		
		
		
	}
}
