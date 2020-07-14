package Stream_th;

import java.io.IOException;
import java.io.OutputStream;

public class Input02 {
	public static void main(String[] args) throws IOException {

    int data = 0;
    System.out.println("문자 입력>> ");
    OutputStream myOut = System.out;
    
    /* 1. OutputStream 추상 클래스는 바이트 단위 출력 스트림의 최상위 추상 클래스이다.
     * 2. System.out 은 모니터 출력장치와 연결
     */

    while((data = System.in.read()) != -1) {
    	//read() 는 한바이트 씩 읽어들임. 더이상 읽을 값이 없다면 -1
    	myOut.write(data); //System.out.write() 을 뜻함.
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
	}
}
