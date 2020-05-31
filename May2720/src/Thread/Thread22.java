package Thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread22 {
	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
		// 중앙처리장치(cpu) 코어 개수만큼 최대 스레드를 사용하는 스레드 틀을 생성

		System.out.println("[작업 처리 요청]");
		Callable<Integer> task = new Callable<Integer>() {

			@Override
			public Integer call() throws Exception {

				int sum = 0;
				for (int i = 1; i <= 10; i++) {
					sum += i;
				}
				return sum;
			}// override

		};// 익명클래스 문법
		
		Future<Integer> future = executorService.submit(task);
	    
		try {
			int sum = future.get();// 스레드 작업이 완료될 때까지 기다렸다가 처리 결과 누적합을 구함
			System.out.println("[처리결과]: " + sum);
			
		}catch(Exception e) {System.out.println("[예외 발생] : " +e.getMessage());}
		executorService.shutdown();//스래드 풀 종료 
	} // main
} // class
