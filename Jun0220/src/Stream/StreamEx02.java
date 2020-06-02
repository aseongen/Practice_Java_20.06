package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Student{
	private String name;
	private int score;
	
	Student(String name, int score){
		this.name =name; this.score =score;
		
	}
	//이클립스 메뉴로 getter() 만 생성한다.

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
}//Student
public class StreamEx02 {
	public static void main(String[] args) {

		List<Student> list = Arrays.asList( //asList() 메서드는 배열을 컬렉션 List로 변경
		new Student ("홍길동",90) , new Student("이순신",100) );
		Stream <Student > stream = list.stream();
		
		//s-> 자체가 오버라이딩 된 상태 
		stream.forEach(s->{
			String name = s.getName(); int scores =s.getScore();
			System.out.println("학생이름: " + name + ", 학생 점수: " + scores );
		});//forEach() 메서드가 반복해주는 루핑 최종처리 메서드
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
