
public class TEST08 {

	int a; // 기본형변수, 멤버변수, 인스턴스변수
	static String b; //참조변수, 멤버변수, 클래스변수
	void m (int c) { //c: 기본형변수, 매개변수,지역변수
		int d =c; //기본형변수,지역변수
	}
	
	public static void main(String[] args) {
	
		int e=0; //e: 기본형변수, 지역변수 
		TEST08 v = new TEST08();//참조변수, 지역변수
		v.m(e); //인자값이 0인 매개변수 복사 
	}
}
