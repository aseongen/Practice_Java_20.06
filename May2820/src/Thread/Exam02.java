package Thread;
class MovieThread extends Thread{

	@Override
	public void run() {
		for(int i=1; i<=2;i++) {
			System.out.println("동영상을 재생합니다.");
			 try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}// for
	}//override
}//MovieThread

class MusicRunnable implements Runnable{

	@Override
	public void run() {
		for(int i=1; i<=2;i++) {
			System.out.println("음악을 재생합니다.");
			 try {Thread.sleep(1000);}catch(InterruptedException e) {}
		}// for
	}//run()
}
	
public class Exam02 {
	public static void main(String[] args) {


		Thread thread1 = new MovieThread();
		thread1.start();
		
		Thread thread2 = new Thread(new MusicRunnable());
		thread2.start();
		
		/* 문제) 다음과 같은 출력결과물이 나올 수 있게 2개의 스레드를 만들어 봅시다.
		 * 각 스레드는 1초 간격으로 작동되게 합니다. (for 반복문  )
		 * 출력결과물) 동영상을 재생합니다.
		 *         음악을 재생합니다.
		 *         동영상을 재생합니다.
		 *         음악을 재생합니다. 
		 */
		
	}
}
