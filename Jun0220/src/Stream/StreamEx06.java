package Stream;

import java.util.Arrays;
import java.util.List;

public class StreamEx06 {
	public static void main(String[] args) {

    List<String> names = Arrays.asList("홍길동","신용권"," 김자바","신용권" , "신민철");
    
    
    //중복 제거
    names.stream()
         .distinct()
         .forEach(name -> System.out.print(name + " "));
	
    System.out.println("\n");
    
    names.stream()
         .filter(n-> n.startsWith("신")) //중간처리 메서드 -> 신으로 시작되는 이름만 필터링
         .forEach(n-> System.out.println(n + " "));
    
    System.out.println();
    //중복 이름을 제거하고 신으로 시작되는 이름만 출력
    names.stream()
          .distinct() //중복이름 제거 
	      .filter(name-> name.startsWith("신"))
	      .forEach(n-> System.out.println(n +" "));
	
	}//main
}
