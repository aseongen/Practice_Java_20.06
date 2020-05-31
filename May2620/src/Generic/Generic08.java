package Generic;
/* 제네릭 클래스 Container을 만들고 멤버변수 t를 정의하고 setter, getter 메서드를 만든다.  */
class Container <T> {
	private T t ;

	public T getT() {
		return t;
	}

	public void setT(T t) {
		this.t = t;
	}
	
}//class container
public class Generic08 {
	public static void main(String[] args) {

		Container<String> con1 =  new Container<>();
		con1.setT("홍길동");
		String str = con1.getT();
		
		Container<Integer> con2 = new Container<>();
		con2.setT(10);
		int value = con2.getT();
		
		
	}
} //class
