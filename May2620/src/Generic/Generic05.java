package Generic;
import java.util.Arrays;
import java.util.List;

class MyList{
	static void printList(List<?> list) {
/* <?> 제네릭 와일드 카드
 * : 모든 클래스, 인터페이스 타입으로 형변환이 가능함.
 */

	for(Object obj : list ) {
		System.out.println(obj+" ");
	}//for
	System.out.println();//개행
	}//static
}//class
public class Generic05 {

	public static void main(String[] args) {

		List<Integer> li = Arrays.asList(10,20,30);
		MyList.printList(li);
		
		//배열을 컬렉션으로 벼경
		List<String> li02 = Arrays.asList("one","two","three");
		MyList.printList(li02);
		
	}
}
