package Thread;

import java.awt.Toolkit;

class BeepThread extends Thread{
//이클립스 메뉴로 Thread 조상 클래스의 run()메서드를 오버라이딩 한다. 
	@Override
	public void run() {
		   Toolkit toolkit = Toolkit.getDefaultToolkit();	
		     for(int i=0; i<=5; i++) {
		    	 toolkit.beep();
		         try {Thread.sleep(500);} catch(Exception e) {}
		     
		     }//for
	
	}//override run()
	
}//class BeepThread 

public class Thread06 {
	public static void main(String[] args) {

    Thread thread = new BeepThread();//조상타입으로 업캐스팅 
    thread.start();//스레드 시작  
     
    for(int i=1; i<=5;i++) {
    	System.out.println(" 띵");
    	try {Thread.sleep(500);} catch(Exception e) {}
    	
    }//for 
    
	
	
	
	}//main

}//class
