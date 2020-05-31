package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Thread21 {
	public static void main(String[] args) {


		//반환값이 없는 작업
		ExecutorService exectorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
	   //cpu 코어(각종 연산을 하는 cpu의 핵심요소)의 수만큼 최대스레드를 사용하는 스레드 풀
		
		System.out.println("[작업 처리 요청]");
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
			   int sum =0;
			   for(int i=1; i<=10; i++) {
				   sum +=i;
				   
			   }//for
			   System.out.println("[처리결과] : " + sum);
			   
			}//override
			
		};//익명객체로 스레드 생성
		Future future = exectorService.submit(runnable);
		// runnable 스레드 작업을 스레드 풀의 작업큐에 저장하고 반환된 Future 객체를 통해 작업 처리 결과를 얻음.
		
		try {
			future.get();
			//get()은 스레드 작업을 완료할 때까지 기다렸다가 작업을 완료하면 처리 결과를 얻는다.
			System.out.println("[작업 처리 완료]");

		}catch(Exception e) {
		   System.out.println("[실행 예외 발생] : " + e.getMessage());
		}
		exectorService.shutdown();//스래드 풀 종료
	}//main
}//class
