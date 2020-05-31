package Generic;
class Util {
	// 제네릭 메서드 생성
	static <T> Box<T> boxing(T t) {
		Box<T> box = new Box<>();
		box.setT(t);
		return box;
	}// 제네릭 메서드
}// class Util

public class Generic02 {
	public static void main(String[] args) {

		Box<Integer> box1 = Util.<Integer>boxing(100);
		int result = box1.getT();
		System.out.println(result);

	}
}
