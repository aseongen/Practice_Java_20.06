package Thread;

class PrintThread2 extends Thread{

	@Override
	public void run() {
		try {
			while(true){
				System.out.println("쓰레드 실행중...");
			    Thread.sleep(1); //쓰레드를 잠시 일시 정지 
			}//while
		}catch(InterruptedException e) {}
		System.out.println("자원 정리중...");
	}//override
}//PrintThread2

public class Thread15 {
	public static void main(String[] args) {

		Thread th = new PrintThread2();// 업캐스팅하면서 스레드 객체 생성
		th.start();
		
		try {Thread.sleep(1000);}catch(InterruptedException e) {}
	 	th.interrupt();
/* InterruptedException 메서드)
 * : 해당 스레드가 일시정지 상태에 있을때 이 메서드를 호출하면 
 * InterruptedException 예외를 발생하며 catch블록으로 제어가 옮겨진다. 
 * 이 메서드는 스레드가 실행 또는 실행대기 상태에 있을때는 예외가 발생하지 않고, 
 * 일시정지 상태에 있을 때 예외가 발생한다. 
 * 
 * 즉, 스레드가 일시정지 상태가 아닌 경우 효과가 없다. 
 */
		
	}

}
