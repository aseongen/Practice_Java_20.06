package unsynchronized;

public class Calculator {

	private int memory;

	public int getMemory() {
		return memory;
	}

/*	public synchronized void setMemory(int memory) { //계산기 메모리에 값을 저장시키는 메서드 
		this.memory = memory;
      try{
    	  Thread.sleep(20000);//스레드를 2초간 일시정지
      
      }catch(InterruptedException e) {}
     
      System.out.println(Thread.currentThread().getName()+" : " + this.memory);
	  //Thread.currentThread().getName()은 현재 실행중인 스레드 이름을 반환
	}//setMemory
*/
	
/* synchronized 키워드로 동기화 메서드를 만들면 임계영역에 되어져서 
 * 한번에 하나의 스레드에 의해서만 스레드 문장이 실행됨 
 */
	
/* 동기화 블록에 의해서 특정영역만 임계영역 처리
 */
	public void setMemory (int Memory) {
		synchronized (this) {
			this.memory = memory;
			
			try {Thread.sleep(20000);}catch(InterruptedException e) {}
			System.out.println(Thread.currentThread().getName() + " : " + memory);
		}//임계영역
	}//setMemory
}
