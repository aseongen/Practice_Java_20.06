package Stream;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx01 {
	public static void main(String[] args) {

   List<String> list = Arrays.asList("홍길동","이순신","강감찬"); //배열을 컬렉션List 로 변환
   
   //Iterator
   Iterator<String> iterator = list.iterator(); 
   while(iterator.hasNext()) {
	   String name = iterator.next();
	   System.out.println(name);
   }//while
   System.out.println();
   
   //자바 8의 스트림 사용
   Stream<String>stream = list.stream();
   stream.forEach(name->System.out.println(name));
	
	
	
	
	
	
	}
}
