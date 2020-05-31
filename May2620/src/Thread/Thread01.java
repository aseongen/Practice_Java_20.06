package Thread;
/* 자바의 멀티 스레드란)
 * 1. 하나의 프로그램 내에서 여러명의 일꾼작업이 교대로 이루어지는 것을 멀티쓰레드라고 한다. 
 * 
 * 첫번째, 멀티스래드 구현법)
 *  -  Thread 클래스를 상속받는다
 *  - 단일 상속만 된다.
 */

class Th01 extends Thread{

	Th01(String name ){
		//조상클래스 생성자를 호출하면서 쓰레드 이름을 설정
		super(name); 
	} //생성자 오버로딩
	
	@Override
	public void run() {
      for(int num=1; num<=5; num++) {
    	  for(int k =1; k<100000000; k++);//쓰레드가 구현될 시간적 여유를 둠
    	  System.out.println(getName() + " : " + num); // getName() 메서드로 쓰레드 이름을 반환
      }//for 
	
	}//override
	
}//Th01

public class Thread01 {

	public static void main(String[] args) {

		Th01 t01 = new Th01("첫번째 쓰레드");
		Th01 t02 = new Th01("두번째 쓰레드");
		//start()를 호출하면 멀티쓰레드가 시작되고 run() 메서드를 내부적 호출한다.
		//그러면 실행대기상태에 있다가 자기차례가 되면 run 상태 즉 실행상태가 된다. 
		t01.start(); t02.start();
		
		
	}//main
}
