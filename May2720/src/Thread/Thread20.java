package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class Thread20 {
	public static void main(String[] args) throws InterruptedException {

		ExecutorService executorService = Executors.newFixedThreadPool(2);
		// 스레드 풀에서 관리하는 최대 스레드 개수가2인 스레드 풀 생성

		for (int i = 0; i < 10; i++) {
			Runnable runnable = new Runnable() {

				@Override
				public void run() {
					ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
					int poolSize = threadPoolExecutor.getPoolSize(); // 스레드 총 개수
					String threadName = Thread.currentThread().getName();// 현재 실행중인 스레드 이름반환
					System.out.println("[총 스레드 개수: " + poolSize + " ] 작업스레드이름: " + threadName);
					// 예외 발생
					int value = Integer.parseInt("삼");
					
				}//override
			};// 익명클래스 문법으로 스레드 생성 ->외부 클래스$번호.class
				// 작업처리요청
			executorService.execute(runnable);
			/* 작업스레드 이름이 모두 다르다 -> 
			 * 작업처리 도중 예외가 발생하면 스레드가 종료되고
			 * 해당 스레드는 스레드 풀에서 제거되고 
			 * 스레드풀은 다른 작업처리를 위해서 새로운 스레드를 계속 생성하기 때문이다. 
			 * 
			 * executorService.submit(runnable)
			 * 작업처리도중 예외가 발생하더라도 스레드는 종료되지 않고 계속 재사용된다. 
			 */
			Thread.sleep(10); //throws 예외처리 완료

		} // for
		executorService.shutdown();
		//스레드를 종료 -> 현재 처리중인 작업뿐만 아니라 작업 큐에 대기하고 있는 모든 작업을 처리한 뒤에 스레드 틀을 종료시킨다. 
		//즉 ,남아있는 작업을 마무리하고 스레드 틀을 종료
	}// main
}
