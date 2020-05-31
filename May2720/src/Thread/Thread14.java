package Thread;

class PrintThread extends Thread {

	private boolean stop;// 기본 값: false

	public void setStop(boolean stop) {
		this.stop = stop;
	}// private 접근 못해서 set으로 초기화 진행

	@Override
	public void run() {

		while (!stop) {
			System.out.println("스레드 실행중");
		} // while
		System.out.println("스레드 자원 정리중");
		System.out.println("스레드 종료");
	}// override

}// printThread

public class Thread14 {
	public static void main(String[] args) {

		/*
		 * printThread 객체를 생성한 다음 스레드를 시작하고 1초 후에 스레드를 종료 시켜 보자.
		 */

		PrintThread printThread = new PrintThread();

		printThread.start();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
		printThread.setStop(true);
	}// main
}// class
