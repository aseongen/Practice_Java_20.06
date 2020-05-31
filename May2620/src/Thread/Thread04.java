package Thread;

import java.awt.Toolkit;

class BeepTask implements Runnable{

	@Override
	public void run() {
	  Toolkit toolkit = Toolkit.getDefaultToolkit();
/* - java.awt 패키지는 AWT 자바 GUI 그리는 API 클래스 묶음이 저장되어 있다.
 * - 로클 경로의 이미지 객체를 생성할 수 있다. 
 *   여기서는 비프음을 발생한다(컴퓨터가 사운드 설정이 되어야 효과 확인함)*/
	  
	  for(int i=0;i<=5;i++) {
		  toolkit.beep();//비프음 발생
		  try {Thread.sleep(500);}catch(Exception e) {} //0.5 초 간격으로 비프음을 발생 
	  }
	}//override
	
}//Runnable

public class Thread04 {
	public static void main(String[] args) {
		//0.5 초 간격으로 5번 비프음이 발생한다 -> 스레드 
		
		Runnable beepTask = new BeepTask();// 업캐스팅하면서 Thread 객체 생성 
		Thread th = new Thread(beepTask);
		th.start(); //스레드 실행 
		
		for(int i=1;i<=5;i++) {
			System.out.println(" 띵");
			try {Thread.sleep(500);}catch(Exception e) {}
			
		}//for 

	}
}
