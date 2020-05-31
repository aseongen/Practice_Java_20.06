package Generic;
//Box<T> 은 제네릭 클래스 
class Box<T>{
	private T t;

	//이클립스 메뉴로
	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}//class Box
public class Generic01 {

	public static void main(String[] args) {
	
	Box<String> box = new Box<>();
	box.setT("abc");//오토박싱
	String str = box.getT(); //오토언박싱 
	System.out.println("반환된 문자열: " + str);
	
	Box<Integer> box2 = new Box<>();
	box2.setT(100);//오토박싱
	int value= box2.getT();//오토 언박싱 
	System.out.println("반환된 숫자: " + value);
	
	}//main
}//class 
