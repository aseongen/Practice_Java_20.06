package Thread;

class SumThread extends Thread {
	private long sum;// 누적합

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}

	@Override
	public void run() {
		/*
		 * 문제)일반 for반복문을 사용하여 1부터 100까지의 누적합을 구해본다.
		 */
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}// 쓰레드 구현 문장
}

public class Thread11 {
	public static void main(String[] args) {
		SumThread sumThread = new SumThread();
		sumThread.start();// 쓰레드가 시작되고 run()메서드 호출

		try {
			sumThread.join();// sumThread의 누적합 구하는 것이 종료될 때까지 메인 스레드를 일시정지
		} catch (InterruptedException e) {
		}
		System.out.println("누적합 = " + sumThread.getSum());
	}
}
