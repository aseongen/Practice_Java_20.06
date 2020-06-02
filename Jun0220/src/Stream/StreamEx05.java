package Stream;

import java.util.Arrays;
import java.util.List;

class Member {
	static int MALE;// 남자
	static int FEMALE; // 여자

	private String name;// 이름
	private int sex;// 성별
	private int age;// 나이

	Member(String name, int sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}

	// 성별과 나이만 get
	public static int getsex() {
		return FEMALE;
	}

	public int getAge() {
		return age;
	}

}// member

public class StreamEx05 {
	public static void main(String[] args) {

		List<Member> list = Arrays.asList(
				new Member("홍길동", Member.MALE, 30), new Member("김나리", Member.FEMALE, 20),
				new Member("신용권", Member.MALE, 40), new Member("박수미", Member.FEMALE, 35),
				new Member("이이이", Member.MALE, 50)
		);
		

		double avgAvg = list.stream() //스트림 생성, 메서드체이닝
		               .filter(m->m.getsex() == Member.MALE) //성별이 남자 0이면 참, 중간처리 필터링
		               .mapToInt(Member :: getAge)// 매개변수 메소드 참조 => Member ->int 즉, 남자 나이 int 값을 구하는 중간처리
		               .average()//남자나이 평균 -> 최종처리
		               .getAsDouble(); //평균 나이를 실수로 처리 
		 System.out.println("남자 평균 : " + avgAvg);
	}//main
}//class
