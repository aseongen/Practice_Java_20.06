package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamEx07 {
	public static void main(String[] args) {

    int [] intArray = {1,2,3,4,5};
    
    //기본 int 타입을 다루는 intStream 
    //int[]배열로부터 IntStream객체 생성
    IntStream intStream = Arrays.stream(intArray);

    intStream
           .asDoubleStream() //IntStream int 타입요소를 double타입요소로 형변환 해서 
           //DoubleStream을 생성하는 중간 처리 메서드 
           .forEach(d -> System.out.print(d + " "));
    /* streamTokenized 의 경우 같은 int 형변환을 두번 사용하면 에러가 난다.
     * 즉 stream은 재사용이 안되기 때문에 한번 더 사용을 원하는 경우 
     * 한번 더 호출해서 사용해야 한다.
     */
    System.out.println("\n");
    
    intStream = Arrays.stream(intArray);
    intStream
           .boxed()//int를 Integer 래퍼 참조타입으로 오토박싱을 해서 stream<Integer>객체를 생성한다. 
           .forEach(obj -> System.out.println(obj.intValue()));
            //intValue()메서드는 기본타입 int로 변경
    
	
	
	
	
	}
}
