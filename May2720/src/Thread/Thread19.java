package Thread;

class WorkThread extends Thread {
	WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
	}

	@Override
	public void run() {

		while (true) {
			try {
				Thread.sleep(1000);

			} catch (InterruptedException e) {
				System.out.println(getName() + " - interrupted ");
				break;// 반복문을 종료하면서 스레드 종료
			} // try~catch
		} // while
		
		System.out.println(getName() + " 스레드 종료..."); // getName()은 스레드 이름을 반환
		
	}// override
}// WorkThread

public class Thread19 {
	public static void main(String[] args) {

		ThreadGroup myGroup = new ThreadGroup("myGroup");//myGroup 스레드 그룹생성
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");//스레드 그룹과 스레드 명을 전달하면서 스레드 객체 생성
	    WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
	    
	    workThreadA.start(); workThreadB.start();
	    System.out.println("[main 스레드 그룹의 list() 메서드 출력내용]");
	    ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
	    //현재 스레ㅔ드가 속한 스레드 그룹정보를 얻음
	    mainGroup.list();
	    /* 헤더로 현재 스레드 그룹이름과 최대 우선순위를 출력하고
	     * 스레드는 [스레드이름, 우선순위, 소속 그룹명], 각 스레드의 우선 순위를 지정하지 않으면 기본값이 5 
	     */
	    System.out.println(); //개행 
	    
	    try {
	    	Thread.sleep(3);
	    }catch(InterruptedException e) {}
	    
	    System.out.println("[ myGroup 스레드 그룹의 interruptedException() 메서드 호출 ");
	    myGroup.interrupt();
	    
	/* 스레드의 안정성 때문에 stop() 메서드는 그룹에 포함된 모든 스레드들에게 일괄 호출하는 것은 가급적 하지말아야한다. 
	 * 대신 interrupt() 메서드로 스레드들을 안전하게 종료하도록 유도하는 것이 좋다. 
	 * 스레드 그룹에서 제공하는 interrupt()메서드를 이용하면 일괄적으로 인터럽트 할 수 있다.
	 * 안전한 종료를 위해서는 발생하는 예외를 개별스레드에서 처리해야 한다. 
	 * 스레드가 일시정지 되었을때 인터럽트가 발생하려면 예외가 발생되고 catch 문이실행됨.
	 * 실행 또는 실행대기 
	 */
	    
	}//main
}//class
