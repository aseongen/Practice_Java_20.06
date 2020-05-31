package Thread;
class AutoSaveThread extends Thread{
	
	public void save() {
		System.out.println("작업할 내용을 저장함.");
	}
	@Override
	public void run() {
		
		 while(true) {
			 try {
				 Thread.sleep(1000);
			 }catch(InterruptedException e) {}
		 }//while
	}//run()
} //AutoSaveThread 


public class Thread17 {
	public static void main(String[] args) {

		AutoSaveThread autoTh = new AutoSaveThread();
		autoTh.setDaemon(true); //메인스레드 즉 주 스레드의 보조역할을 하는 데몬스레드를 만든다.
		
		try{Thread.sleep(3000);}catch(InterruptedException e) {}
		System.out.println("메인 주 스레드 종료 ");
		
	} //main
}//class
