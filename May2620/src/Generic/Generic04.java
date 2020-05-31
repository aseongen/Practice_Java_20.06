package Generic;
import java.util.Arrays;
import java.util.List;

public class Generic04 {

	static int sumList(List<? extends Number> list) {
/* <?extends Number> 
 *  : 제네릭 와일드카드는 Number 조상타입 또는 그 자손 타입으로는 제네릭타입 형변환을 할  수 있다. 
 *  : - > 상한선을 그어줌 
 */
		int sum=0;
		for(Number n : list) {
			//intValue() 메서드는 기본 정수숫자로 변경하고 누적합을 구함
			sum += n.intValue();
		}
	 return sum;
	}//sumList 
	public static void main(String[] args) {

		Integer[] arr = {10,20,30};
	
		//asList() 제네릭 메서드는 배열을 컬렉션 List 로 변경
		List<Integer> list = Arrays.asList(arr); 
		
		/*  Arrays.asList => new ArrayList<>(); => 원본 배열의 주소값을 가져온다.(주소값 고정)
		 * 따라서, 해당 asList 내용을 수정하면 원본 배열도 함께 변경되기 때문에 ->List에 새로운 원소 추가, 삭제가 불가하다.
		 * 사용하는이유 ) 배열의 내용 자체를 수정하려고 할때 List로 바꿔서 편리하게 사용하기 위함
		 */
		
		int sum = sumList(list);
		System.out.println("누적합: " + sum);
	
	}//main
}//class
