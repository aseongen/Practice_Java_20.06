package Stream_th;

import java.io.IOException;
import java.io.InputStream;

public class Input01 {
	public static void main(String[] args) {

    int data=0; //읽어들인 데이터를 저장할 변수
    System.out.print("문자 입력>> ");
	
    try {
    	InputStream myIn =System.in;
    	/*  1. InputStream 은 바이트 단위 입력스트림의 최상위 추상클래스
    	 *  2. System.in 은 키보드 입력장치와 연결
    	 */
    	
    	while((data = myIn.read())!= -1){
    		/*1. read() 메서드로 한 바이트 씩 읽어들임.
    		 *2. 더 이상 읽을 값이 없다면  -1
    		 */
    		
    		System.out.write(data);
    	}
    	
    	
    }catch(IOException ie) {
    	ie.printStackTrace();
    }
	
	
	}
}
