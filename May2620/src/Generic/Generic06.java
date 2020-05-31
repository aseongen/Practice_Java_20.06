package Generic;
import java.util.Arrays;
import java.util.List;

public class Generic06 {
	public void addNumber(List<? super Integer> list) {

		/*
		 * <? super Integer> \ : 제네릭 와일드 카드는 Integer 자손타입 또는 그 조상 타입으로 제네릭 타입 형변환이 가능하다.
		 */
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		} // for

		System.out.println();

	}

	public static void main(String[] args) {


		Number[] arr= {10,20,30};
		List<Number> li = Arrays.asList(arr);
		
	
	
	}
}
