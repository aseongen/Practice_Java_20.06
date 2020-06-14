class Person{
	final String NARA = "Korea"; // 생성과 동시에 초기화 진행해야한다.
	final String  JUMIN;
	String name;
	
	 //오버로딩
	Person(String JUMIN ,String name){
		this. JUMIN= JUMIN; this.name=name;
	} //생성자 오버로딩 되면 기본 생성자를 묵시적으로 제공하지 않는다. 
	
	   void print() {
	    	 System.out.println("국가명: "+ NARA);
	    	 System.out.println("주민번호: "+ JUMIN);
	    	 System.out.println("이름: "+ this.name); //this는 생략 가능 
	     }
}
public class TEST11 {
	public static void main(String[] args) {
		
		Person p = new Person("1234-567","이순신");
		p.print();
	}		
}


