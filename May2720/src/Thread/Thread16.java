package Thread;

class PrintThread3 extends Thread{

	@Override
	public void run() {
		
		while(true) {
			System.out.println("스레드 실행중...");
			if(Thread.interrupted() == true) {
				break;//무한루프문 종료
				
/* Interrputed(), isInterrupted() 
 * : 2개의 메서드는 일시정지를 만들지 않고도 interrupted()가 호출되었는지를 알 수 있다.
 *    즉, interrupt()가 호출되면 true를 반환한다.
 * : Interrupted() :정적메서드
 * : isInterrupted() : 인스턴스 메서드 -> 객체 생성해서 접근해야 한다. 
 */

			}//if 
		}//while
		System.out.println("스레드 자원 정리중....");
		System.out.println("!!자원 종료!!");
	}//override
}//PrintThread3
public class Thread16 {
	public static void main(String[] args) {

		Thread th = new PrintThread3();
		th.start();
		
		//이상태로 실행시 무한으로 계속돈다.
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
	    th.interrupt(); // 종료 시점 알려줌
		
	
	}//main
}//class
