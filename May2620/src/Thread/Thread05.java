package Thread;

import java.awt.Toolkit;

public class Thread05 {
	public static void main(String[] args) {

		// 익명클래스로 스레드 발생 : 외부클래스 $번호.class
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for (int i = 1; i <= 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				} // for
			}// run override
		});// 첫번째 익명객체로 스레드 발생

		// 스레드가 시작되고 내부적으로 run() 메서드 자동호출
		thread.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(" 띵");
			// 0.5 초 간격
			try {Thread.sleep(500);} catch (Exception e) {}
		} // for
	}// main
}// class
