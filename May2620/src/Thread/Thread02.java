package Thread;
/* 두번째, 멀티스레드 구현법)
 * 1. Runnable 인터페이스 구현상속을 받는다. 다중 상속을 받을 수 있다.
 * 2. 하지만, 멀티쓰레드를 시작할 start()메서드를 호출할 수 없다.
 *   그러므로, Runnable 구현 상속한 자손 객체를 Thread 생성자 인자값으로 전달해서 또 한번 더 객체 생성해서 
 *   Start()를 호출해야한다.
 */

class Th02 implements Runnable{

	@Override
	public void run() {

	   for(int num=1; num<=5; num++) {
		   for(int k=1; k<100000000; k++);
		   System.out.println(Thread.currentThread().getName()+" : " + num);
		   //현재 실행중인 쓰레드 이름을 반환
	   }//for
	
	}//override run
	
}//Class Th02

public class Thread02 {
	public static void main(String[] args) {

		Th02 t1 = new Th02(); 
		Th02 t2 = new  Th02();
		Thread t3 = new Thread(t1, " 첫번째 쓰레드");
		Thread t4 = new Thread(t2, " 두번째 쓰레드");
		t3.start(); t4.start();
		//쓰레드를 시작하고 run()메서드 자동호출 
		
		
		
	}//main
}//class 
