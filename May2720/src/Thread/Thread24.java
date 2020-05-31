package Thread;

class MovieThread extends Thread{

	@Override
	public void run() {
		while(true) {
		System.out.println("동영상 재생 ");
		
//문제) 인터럽트를 호출했을 떄 스레드 종료하는 코드 작성 
		//방법1)
		 try {
		    	Thread.sleep(1000);

		  } catch (InterruptedException e) {
			 break;
          } //try~catch
		 
		//방법2)
		 if(this.isInterrupted()) {//==true 가 생략됨, 해당 스레드가 인터럽트가 발생되면 참
			 break;
		 }//if
	 }//while
		System.out.println(getName() + " 스레드 종료...");
   }//override
	
}//MovieThread 
public class Thread24 {
	public static void main(String[] args) {

		Thread th = new MovieThread();
		th.start();
		
		try {Thread.sleep(1000);} catch(InterruptedException e) {}
		
		th.interrupt();

	  }//main
}//Thread24
