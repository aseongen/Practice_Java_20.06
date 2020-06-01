package Ramda;

import java.util.function.ToIntFunction;

public class Function16 {
    static class Student{
    	private String name;// 학생명
    	private int englishScore;//영어점수
    	private int mathScore;//수학점수
    	
    	Student(String name,int englishScore,int mathScore){
    		this.name=name; this.englishScore=englishScore; this.mathScore=mathScore;
    	}

		public String getName() {
			return name;
		}

		public int getEnglishScore() {
			return englishScore;
		}

		public int getMathScore() {
			return mathScore;
		}    	
    }//외부클래스명$내부클래스명.class => FunctionTest16$Student.class
    
    private static Student[] students = {
    	new Student("홍길동",90,96),
    	new Student("이순신",95,93)
    };
    
    public static double avg(ToIntFunction<Student> function) {
    	int sum=0;
    	for(Student student:students) {
    		sum += function.applyAsInt(student);
    	}
    	double avg=(double)sum/students.length;
    	return avg;
    }
	public static void main(String[] args) {
//		double englishAvg = avg(s->s.getEnglishScore());
		
		//문제)위의 람다식을 주석처리 하고 매개변수 메서드 참조를 사용하여 각각 영어 점수와 수학 점수 평균을 구해보자
		
	
		double englishAvg = avg(Student::getEnglishScore);
		System.out.println("영어점수 평균 = " + englishAvg);
		
//		double mathAvg = avg (s->s.getMathScore());
        double mathAvg = avg(Student :: getMathScore);
		System.out.println("수학점수 평균 : " + mathAvg);
 
	}//main
}//class











