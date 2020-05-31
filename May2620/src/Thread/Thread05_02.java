package Thread;

import java.awt.Toolkit;

public class Thread05_02 {
	public static void main(String[] args) {

		//자바 8버전에서 추가된 람다식(함수형 언어)를 사용한 스래드 
 
		Thread thread = new Thread(() -> {
		     Toolkit toolkit = Toolkit.getDefaultToolkit();	
		     for(int i=0; i<=5; i++) {
		    	 toolkit.beep();
		         try {Thread.sleep(500);} catch(Exception e) {}
		     
		     }//for
		});
		
		thread.start();

		for (int i = 1; i <= 5; i++) {
			System.out.println(" 띵");
			// 0.5 초 간격
			try {Thread.sleep(500);} catch (Exception e) {}
		} // for
	}// main
}// class
