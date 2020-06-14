import java.util.Random;
import java.util.Scanner;

/* 박스 클래스에  메인클래스를 호출할 수 있게  완성하여라 */
class Box<T, M> {
	private T key;
	private M value;

	public T getKey() {
		return key;
	}

	public void setKey(T key) {
		this.key = key;
	}

	public M getValue() {
		return value;
	}

	public void setValue(M value) {
		this.value = value;
	}

}// class Box

//생성자와 추가하여 클래스를 불러올 메서드를 추가하여라

public class TEST21 {
	public static void main(String[] args) {

		/*
		 * 1.파라미터 변수 2개를 가진 클래스와 그 클래스를 파라미터로받는 리스트를 생성후 스캐너를 사용하여 리스트에 클래스 객체를 10개 생성후
		 * 클래스 객체중 하나를 랜덤으로 당첨 처리를 하고 (힌트 for문 이용) 
		 * 사용자가 당첨을 찾는 코드를 작성// ( 힌트while문 사용)
		 */
		Scanner sc = new Scanner(System.in);
	
	    Box<Integer,Integer> box = new Box<>();
	    	    		
	    int num =sc.nextInt();
	    int [] arr = new int [num];
	    
	    for(int i=0; i<=arr[num]; i++) {
		    System.out.println("1~10까지 입력하세요 : ");
		    int num1 = sc.nextInt();
		    
		    Random generator = new Random();
		    int nm;
		    nm = generator.nextInt(10);
		  
	    	box.setKey(num);
	    	
	    } //for 
	    
	    int sd = box.getKey();
		
		
		}//main

	}//class
