package synchronized2;

import unsynchronized.Calculator;
import unsynchronized.User1;
import unsynchronized.User2;

public class Thread10 extends Thread {
	public static void main(String[] args) {

	/* 문제)
	 * synchronized 패키지를 생성하고,
	 * Thread10 클래스 만들고 unsynchronized의 해당 클래스를 공유해서 동기화 
	 * 즉 임계영역을 처리하여 user1 스레드는 100, user2 스레드는 50이 출력되게 해본다.
	 */

	Calculator calculator = new Calculator();
	
	User1 user1 = new User1();
    user1.setCalculator(calculator);
    user1.start();

	User2 user2 = new User2();
	user2.setCalculator(calculator);
	user2.start();
	
	}//main
}//class
