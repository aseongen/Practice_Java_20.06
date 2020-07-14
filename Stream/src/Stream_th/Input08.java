package Stream_th;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Input08 {
	public static void main(String[] args) {

     String fileName;
     InputStreamReader myIn = new InputStreamReader(System.in);
     /* 1. System.in 은 키보드 입력장치와 연결
      * 2. InputStreamReader : 읽어들인 바이트를 문자스트림으로 변환
      */
    
     BufferedReader keyBr = new BufferedReader(myIn);
     
     try {
    	 System.out.println("파일 이름 입력> ");
    	 fileName = keyBr.readLine();//한줄 끝까지 문자열로 읽어들임
    	 System.out.println(fileName);
    	 
     }catch(IOException ie) {ie.printStackTrace();}
     finally {
    	 try {
    		 if(keyBr != null) keyBr.close();
    		 if(myIn != null) myIn.close();
    		 
    	 }catch(Exception e) { e.printStackTrace();}
    	 
     }
	
	
	}
}
