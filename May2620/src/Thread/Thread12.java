package Thread;

class WorkObject{
	synchronized void methodA() {
		System.out.println("Thread A 의 methodA() 작업 실행");
		try {
			wait();// ThreadA를 일시정지 상태로 만듬 
		}catch(InterruptedException e) {}
	}// 첫번째 동기화 메서드
	
	synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업실행");
	    notify();//일시 정지된 ThreadA를 실행대기 상태로 만듬.
/* 1. notify ()메서드는 wait() 에 의해서 일시 정지된 스레드 중 한개를 실행 대기 상태로 만든다.
 * 2. 이 메서드는 Object 클래스 메서드이기 때문에 모두 공유 객체에서 호출 가능하고,
 *    주의: 동기화메서드 또는 동기화 블록 내에서만 사용 가능하다.
 */
	    try {
	    	wait();
	    }catch(InterruptedException e) {}
	    
	}//두번째 동기화 메서드 
	}//workObject

class ThreadA extends Thread{
	private WorkObject workObject;
	
	ThreadA(WorkObject workObject){
		this.workObject=workObject;
	}

	@Override
	public void run() {

		for(int i=1;i<=10;i++) {
			workObject.methodA();
		}//override 
	
	}//run
	
}//ThreadA

class ThreadB extends Thread{

	private WorkObject workObject;
	
	ThreadB(WorkObject workObject){
		this.workObject = workObject;
	}//생성자 오버로딩
	
	@Override
	public void run() {

		for(int i=1; i<=10; i++) {
			workObject.methodB();
		}//for
	}//override 
	
}//ThreadB

public class Thread12 {
	public static void main(String[] args) {
		
	    WorkObject workObject = new WorkObject();
	    
	    ThreadA threadA = new ThreadA(workObject);
	    ThreadB threadB = new ThreadB(workObject);
	    threadA.start();
	    threadB.start();
	
	}//main
}//class 
