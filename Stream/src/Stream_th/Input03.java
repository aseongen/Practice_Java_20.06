package Stream_th;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Input03 {

	public static void main(String[] args) {

		int data = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;

		System.out.println("문자입력 >> ");
		
		try {
             while((data = myIn.read()) != -1) {
            	 // 코드 등 문서가 끝나면 -1을 반환
            	 
            	 if(data == 'x' || data == 'x' ) {
            		 //|| or 연산
            		 break; //반복문 중단
            		 
            	 }
            	 myOut.write(data);
             
             }
             
		} catch (Exception e) {	e.printStackTrace();} 
		finally {

			try {
				
             if(myOut != null) myOut.close();
             if(myIn != null) myIn.close();
				
			} catch (Exception e) {	e.printStackTrace();}

		}

	}
}
